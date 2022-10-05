package com.example.primeraaplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSumar : Button = findViewById(R.id.btnSumar)
        btnSumar.setOnClickListener{
            val intent: Intent = Intent(this, Sumar:: class.java)
            startActivity(intent)
        }

        val btnCambiarColor : Button = findViewById(R.id.btnCambiarColor)
        btnCambiarColor.setOnClickListener{
            val intent: Intent = Intent(this, CambiarColor:: class.java)
            startActivity(intent)
        }
        val btnGaleria : Button = findViewById(R.id.btnGaleria)
        btnGaleria.setOnClickListener{
            val intent: Intent = Intent(this, Galeria:: class.java)
            startActivity(intent)
        }
        val btnImagen : Button = findViewById(R.id.btnImagen)
        btnImagen.setOnClickListener{
            val intent: Intent = Intent(this, Imagen:: class.java)
            startActivity(intent)
        }
        val btnAlinearTexto : Button = findViewById(R.id.btnAlinearTexto)
        btnAlinearTexto.setOnClickListener{
            val intent: Intent = Intent(this, AlinearTexto:: class.java)
            startActivity(intent)
        }
        val btnTextoMasMenos : Button = findViewById(R.id.btnTextoMasMenos)
        btnTextoMasMenos.setOnClickListener{
            val intent: Intent = Intent(this, TextoMasMenos:: class.java)
            startActivity(intent)
        }
        val btnCambiarTexto : Button = findViewById(R.id.btnCambiarTexto)
        btnCambiarTexto.setOnClickListener{
            val intent: Intent = Intent(this, CambiarTexto:: class.java)
            startActivity(intent)
        }

    }

}