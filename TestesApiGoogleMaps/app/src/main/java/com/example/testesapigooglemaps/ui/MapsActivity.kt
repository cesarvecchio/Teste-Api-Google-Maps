package com.example.testesapigooglemaps.ui

import android.Manifest
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testegooglemaps.adapter.RestauranteAdapter
import com.example.testegooglemaps.adapter.RestauranteItemClickListener
import com.example.testesapigooglemaps.R
import com.example.testesapigooglemaps.config.MapStyle
import com.example.testesapigooglemaps.dto.input.GoogleMapDTO
import com.example.testesapigooglemaps.model.Restaurante
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import com.google.android.gms.tasks.Task
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException


class MapsActivity : AppCompatActivity(),
                        OnMapReadyCallback,
                        RestauranteItemClickListener {

    private val DEFAULT_ZOOM = 17f

    private lateinit var mMapStyle: String
    private lateinit var mMap: GoogleMap
    private lateinit var mFusedLocationProviderClient: FusedLocationProviderClient

    lateinit var clMapStyle: ConstraintLayout
    lateinit var icMapStyle: ImageView
    lateinit var icGPS: ImageView
    lateinit var icShowList: ImageView
    lateinit var rvRestaurante: RecyclerView

    var showList = true
    var showStyleList = false

    private var idUsuario: Int = 0

    private lateinit var polylineList: List<LatLng>
    private lateinit var myLocation: LatLng

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)

        // pede as permições para o app utilizar o GPS do celular
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkPermission();
        }

        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        // seta o layout padrão do mapa
        mMapStyle = MapStyle().standard




        clMapStyle = findViewById(R.id.cl_map_styles)
        icMapStyle = findViewById(R.id.ic_map_style)
        icGPS = findViewById(R.id.ic_gps)
        icShowList = findViewById(R.id.ic_show_list)
        rvRestaurante = findViewById(R.id.rv_restaurantes)


        idUsuario = intent.getIntExtra("idUsuario", 0)

        initRestaurante()
    }


    fun initRestaurante() {
        var lista: List<Restaurante>?

        lista = listOf(
            Restaurante("a", "Rua Iolanda Diorio Franca, 29", "a"),
            Restaurante("a", "R. Serra dos Cristais - Vila Minerva", "a")
        )

        val restauranteAdapter = RestauranteAdapter(
            this,
            lista,
            this
        )
        rvRestaurante.adapter = restauranteAdapter
        rvRestaurante.layoutManager = GridLayoutManager(
            this,
            1,
            LinearLayoutManager.VERTICAL,
            false
        )
    }


    // metodos para fazer a animação de mostrar e esconder os as listas de restaurantes
    // ou de mudança de estilo do mapa
    fun showMapStyleList(view: View) {
        animacaoMapStylesList()
    }

    fun animacaoMapStylesList() {
        if(showStyleList) {
            clMapStyle.animate()
                .translationX(-clMapStyle.width.toFloat())
                .alpha(0.0f)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator?) {
                        super.onAnimationEnd(animation)
                    }
                })

            icMapStyle.animate()
                .translationX(-clMapStyle.width.toFloat())

            icMapStyle.setImageResource(R.drawable.ic_show_map_style_false)
            showStyleList = false

        } else {
            clMapStyle.animate()
                .translationX(0f)
                .alpha(1.0f)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator?) {
                        super.onAnimationEnd(animation)
                    }
                })

            icMapStyle.animate()
                .translationX(0f)

            icMapStyle.setImageResource(R.drawable.ic_show_map_style_true)
            showStyleList = true
        }
    }

    fun showBusinessList(view: View) {
        animacaoBusinessList()

    }

    fun animacaoBusinessList() {
        if(showList) {
            rvRestaurante.animate()
                .translationY(rvRestaurante.height.toFloat())
                .alpha(0.0f)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        super.onAnimationEnd(animation)
//                        rvRestaurante.visibility = View.GONE
                    }
                })

            icShowList.animate()
                .translationY(rvRestaurante.height.toFloat())

            icShowList.setImageResource(R.drawable.ic_show_business_false)
            showList = false

        } else {
            rvRestaurante.animate()
                .translationY(0F)
                .alpha(1.0f)
                .setListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationStart(animation: Animator) {
                        super.onAnimationStart(animation)
//                        rvRestaurante.visibility = View.VISIBLE
                    }
                })

            icShowList.animate()
                .translationY(0f)

            icShowList.setImageResource(R.drawable.ic_show_business_true)
            showList = true
        }
    }



    fun getMyLocation(view: View) {
        getDeviceLocation()
    }

    override fun onRestauranteClick(restaurante: Restaurante) {
        findBusiness(restaurante)

        animacaoBusinessList()

        criarRota(
            myLocation,
            restaurante.endereco
        )

    }

    fun mudarEstilo(view: View) {

        val style: String = when(view.id) {
            R.id.ic_map_standard -> MapStyle().standard
            R.id.ic_map_silver -> MapStyle().silver
            R.id.ic_map_retro -> MapStyle().retro
            R.id.ic_map_dark -> MapStyle().dark
            R.id.ic_map_night -> MapStyle().night
            R.id.ic_map_aubergine -> MapStyle().aubergine
            else -> MapStyle().standard
        }

        mMap.setMapStyle(MapStyleOptions(style))
    }





    // Funções inicializar o mapa
    override fun onMapReady(googleMap: GoogleMap?) {

        if (googleMap != null) {

            mMap = googleMap

            getDeviceLocation()

            // permissões para conseguir ativar o isMyLocationEnabled
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return
            }
            // irá criar a marcação azul da localização atual do dispositivo
            mMap.isMyLocationEnabled = true

            // irá desabilitar alguns botões padrões do google maps
            mMap.uiSettings.isMyLocationButtonEnabled = false

        }
    }

    // função que irá pegar as informações do local de origem e destino e
    // chamara as outras funções para criar o trajeto de um local para o outro
    fun criarRota(origem: LatLng, destino: String) {

        val URL = getDirectionURL(origem, destino)
        GetDirection(URL).execute()
    }

    // Função que irá pegar o endereço de um local e transformar em Latitude e Longitude
    fun findBusiness(estabelecimento: Restaurante) {
        val geocoder = Geocoder(this)
        var list: List<Address>

        try {
            list = geocoder.getFromLocationName(estabelecimento.endereco, 1)

            if (list.isNotEmpty()) {
                val address = list.get(0)

                criarMarcacao(
                    LatLng(address.latitude, address.longitude),
                    DEFAULT_ZOOM,
                    estabelecimento.nome
                )

            }

        } catch (e: IOException) {
            e.printStackTrace()
        }


    }

    // Função para criar a marcação no mapa
    fun criarMarcacao(latLong: LatLng, zoom: Float, title: String) {

        // faz a verificação para ver se o titulo esta como Local Atual
        // para não criar a marcação no local do dispositivo
        if (title != "Local Atual") {

            // faz a limpeza do mapa para não criar varias marcações ou trajetos ao mesmo tempo
            mMap.clear()

            // criar o marcador recebendo a posição (Latitude e Longitude) e o titulo da localização
            mMap.addMarker(MarkerOptions().position(latLong).title(title))

        }
        // Move a camera para a localização  especificada,
        // e recebe um valor de zoom para ele se  aproximar do local marcado no mapa
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLong, DEFAULT_ZOOM))

    }

    // Função para pegar a localização atual do dispositivo
    fun getDeviceLocation() {
        mFusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        try {
            val location: Task<Location> = mFusedLocationProviderClient.lastLocation

            location.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val currentLocation: Location = task.result

                    criarMarcacao(
                        LatLng(currentLocation.latitude, currentLocation.longitude),
                        17f,
                        "Local Atual"
                    )

                    // vai definir a localização do dispositivo para ser
                    // utilizado na criação da rota
                    myLocation = LatLng(currentLocation.latitude, currentLocation.longitude)

                } else {
                    println(task.exception)
                    Toast.makeText(this, "Não ta pegando", Toast.LENGTH_SHORT).show()
                }
            }

        } catch (e: SecurityException) {
            e.printStackTrace()
        }

    }

    // Função que verifica se as permissões forma concedidas
    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED ||
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) { //Can add more as per requirement
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ),
                123
            )
        }
    }



    // Daqui pra baixo são as funções para criar a rota de um local para o outro
    fun getDirectionURL(origin: LatLng, dest: String) : String{
        return "https://maps.googleapis.com/maps/api/directions/json?origin=${origin.latitude},${origin.longitude}&destination=${dest}&sensor=false&mode=driving&key=${getString(
            R.string.google_maps_key
        )}"
    }

    private inner class GetDirection(val url: String) : AsyncTask<Void, Void, List<List<LatLng>>>(){
        override fun doInBackground(vararg params: Void?): List<List<LatLng>> {
            val client = OkHttpClient()
            val request = Request.Builder().url(url).build()
            val response = client.newCall(request).execute()
            val data = response.body()!!.string()

            val result =  ArrayList<List<LatLng>>()
            try{
                val respObj = Gson().fromJson(data, GoogleMapDTO::class.java)

                val path =  ArrayList<LatLng>()

                for (i in 0 until respObj.routes[0].legs[0].steps.size){
                    path.addAll(decodePolyline(respObj.routes[0].legs[0].steps[i].polyline.points))
                }
                result.add(path)
            }catch (e: Exception){
                e.printStackTrace()
            }
            return result
        }

        override fun onPostExecute(result: List<List<LatLng>>) {
            val lineoption = PolylineOptions()
            for (i in result.indices){
                lineoption.addAll(result[i])
                lineoption.width(10f)
                lineoption.color(Color.BLUE)
                lineoption.geodesic(true)
            }
            mMap.addPolyline(lineoption)
        }
    }

    fun decodePolyline(encoded: String): List<LatLng> {

        val poly = ArrayList<LatLng>()
        var index = 0
        val len = encoded.length
        var lat = 0
        var lng = 0

        while (index < len) {
            var b: Int
            var shift = 0
            var result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlat = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lat += dlat

            shift = 0
            result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlng = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lng += dlng

            val latLng = LatLng((lat.toDouble() / 1E5), (lng.toDouble() / 1E5))
            poly.add(latLng)
        }

        return poly
    }
}