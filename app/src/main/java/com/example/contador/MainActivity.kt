package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var contador: Int = 0
    var bandera = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        contador = 0
        bandera = true


         val txtnumeros = findViewById<TextView>(R.id.txtnumeros)
         val btnContador = findViewById<Button>(R.id.btnContador)
         val btnReiniciar = findViewById<Button>(R.id.btnRefrescar)

        btnContador.setOnClickListener {
            if (contador == 0)
                bandera = true
            else if (contador == 10)
                bandera = false
            if (bandera == true)
               contador = contador.inc()
            else if (bandera == false)
                contador = contador.dec()

            txtnumeros.text = "$contador"
        }
        btnReiniciar.setOnClickListener {
            contador = 0
            bandera = true
            txtnumeros.text = "$contador"
        }
    }
}
