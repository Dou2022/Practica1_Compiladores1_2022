package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Reportes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reportes)
    }
    fun principal(view: View){
        val principal = Intent(this,MainActivity:: class.java)
        startActivity(principal)
    }
    fun grafico(view: View){
        val grafico = Intent(this,Graficos::class.java)
        startActivity(grafico)
    }
}