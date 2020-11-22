package br.com.ddproject.anobissexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = buttonConverter as Button

        btn.setOnClickListener {
            var numero = editTextNumber.text.toString().toInt()
            var calcular = Calcular(numero)
            Resultado.text = calcular.toString()
        }
    }

    private fun Calcular(numero: Int): String {

        return if (numero % 4 == 0 && numero % 100 != 0) {
            "O ano $numero é BISSEXTO"
        } else if (numero % 4 == 0 || numero % 400 != 0) {
            "O ano $numero não é BISSEXTO"
        } else if (numero % 4 == 0 || numero % 400 == 0) {
            "O ano $numero é BISSEXTO"
        } else {
            "Ano Digitado Invalido!!"
        }
    }
}