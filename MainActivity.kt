package com.example.conversormoeda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextValor = findViewById<EditText>(R.id.editTextValor)
        val editTextTaxaConversao = findViewById<EditText>(R.id.editTextTaxaConversao)
        val buttonConverter = findViewById<Button>(R.id.buttonConverter)
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        buttonConverter.setOnClickListener {
            val valorStr = editTextValor.text.toString()
            val taxaConversaoStr = editTextTaxaConversao.text.toString()

            if (valorStr.isNotEmpty() && taxaConversaoStr.isNotEmpty()) {
                val valor = valorStr.toDouble()
                val taxaConversao = taxaConversaoStr.toDouble()
                val valorConvertido = valor * taxaConversao

                textViewResultado.text = "Valor convertido: $valorConvertido"
            } else {
                textViewResultado.text = "Por favor, insira o valor e a taxa de conversão."
            }
        }
    }
}