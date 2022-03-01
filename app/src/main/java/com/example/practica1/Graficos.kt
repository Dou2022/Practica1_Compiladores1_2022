package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Graficos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graficos)
    }
    fun principal(view: View){
        val principal = Intent(this,MainActivity:: class.java)
        startActivity(principal)
    }
    fun reporte(view: View){
        val grafico = Intent(this,Reportes:: class.java)
        startActivity(grafico)
    }
}