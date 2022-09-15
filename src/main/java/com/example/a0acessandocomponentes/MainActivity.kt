package com.example.a0acessandocomponentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), OnClickListener {

    private var tamanho = 18
    private lateinit var aumentar:Button
    private lateinit var diminuir:Button
    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aumentar = findViewById(R.id.aumentar)
        diminuir = findViewById(R.id.diminuir)
        aumentar.setOnClickListener(this)
        texto = findViewById(R.id.texto)

        diminuir.setOnClickListener {
            tamanho -= 1
            texto.textScaleX -= 1
            texto.text = "$tamanho"
        }
    }

    override fun onClick(botao: View?) {
        if (botao == aumentar) {
            tamanho += 1
            texto.textScaleX += 1
            texto.text = "$tamanho"
        }
    }
}