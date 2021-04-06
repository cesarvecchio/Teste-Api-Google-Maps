package com.example.testegooglemaps.ui

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testegooglemaps.R
import com.example.testegooglemaps.adapter.RestauranteAdapter
import com.example.testegooglemaps.adapter.RestauranteItemClickListener
import com.example.testegooglemaps.model.Restaurante

class MainActivity : AppCompatActivity(),
    RestauranteItemClickListener{

    lateinit var btnAdicionarRestaurante:Button
    lateinit var tvTexto:TextView
    lateinit var rvRestaurante: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdicionarRestaurante = findViewById(R.id.btn_adicionar_restaurante)
        tvTexto = findViewById(R.id.tv_texto)
        rvRestaurante = findViewById(R.id.rv_restaurantes)

        // criação do canal para conseguir lançar uma notificação
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            var channel = NotificationChannel(
                "My notification",
                "My notification",
                NotificationManager.IMPORTANCE_DEFAULT)

            var manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)
        }

        initRestaurante()

    }

    fun initRestaurante() {
        val lista:List<Restaurante> = listOf(
            Restaurante("a","a","a"),
            Restaurante("b","b","b"),
            Restaurante("c","c","c"),
            Restaurante("d","d","d"))


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

    fun notificacao(view: View) {

//        var builder = NotificationCompat.Builder(this, "My notification")
//            .setSmallIcon(R.drawable.arrow_right)
//            .setContentTitle("Ulha só")
//            .setContentText("Opa rapaiz olha isso ai")
//            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//
//        var manager = NotificationManagerCompat.from(this).notify(1, builder.build())

    }

    override fun onRestauranteClick(restaurante: Restaurante) {
        tvTexto.text = restaurante.endereco
    }

}