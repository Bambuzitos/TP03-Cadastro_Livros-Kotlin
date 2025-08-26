package br.unisanta.tp03_cadastro_livros

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalhesActivity : AppCompatActivity() {

    private lateinit var txtTitulo: TextView
    private lateinit var txtAutor: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        txtTitulo = findViewById(R.id.txtTitulo)
        txtAutor = findViewById(R.id.txtAutor)

        val titulo = intent.getStringExtra("TITULO")
        val autor = intent.getStringExtra("AUTOR")
        val fabVoltar: FloatingActionButton = findViewById(R.id.fabVoltar)

        fabVoltar.setOnClickListener {
            finish()
        }

        txtTitulo.text = "Título: $titulo"
        txtAutor.text = "Autor: $autor"
    }
}
