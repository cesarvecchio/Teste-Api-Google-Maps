package com.example.testesapigooglemaps.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import com.example.testesapigooglemaps.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun passarTela(view: View) {
        val map = Intent(this, MapsActivity::class.java)

        map.putExtra("idUsuario", 1)

        startActivity(map)
    }

}