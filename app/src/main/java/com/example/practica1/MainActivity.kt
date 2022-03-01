package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.practica1.analizadores.cup.*
import  com.example.practica1.analizadores.flex.*
import com.example.practica1.domain.Lexema
import java.io.Reader
import java.io.StringReader

class MainActivity : AppCompatActivity() {

    var prueba: Button? = null
    var texto: EditText? = null
    var ingreso: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto = findViewById(R.id.textoEntrada)
        prueba = findViewById(R.id.prueba)
        ingreso = findViewById(R.id.SalidaPrueba)

    }

    fun ejecutar(view: View){
        try {
            val text1: String = texto?.text.toString()+" "
            val text:Reader = StringReader(text1)
            val lexico2 = AnalizadorLexico(text)
            //val lexico = LexicoNumero(text);
            //val sintactico = OperacionParser(lexico)
            val sintactico2 = parser(lexico2)
            sintactico2.parse()


            ingreso?.text = sintactico2.listado.toString()

        }catch ( e: Exception){
            Log.d("MainActivity", "error: "+e.message)
        }
    }
/*
    fun grafico(view: View){
        val grafico = Intent(this, Graficos:: class.java)
        startActivity(grafico)
    }
    S
 */
}