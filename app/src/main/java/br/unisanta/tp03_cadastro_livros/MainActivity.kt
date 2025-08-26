package br.unisanta.tp03_cadastro_livros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var edtTitulo: EditText
    private lateinit var edtAutor: EditText
    private lateinit var btnCadastrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtTitulo = findViewById(R.id.edtTitulo)
        edtAutor = findViewById(R.id.edtAutor)
        btnCadastrar = findViewById(R.id.btnCadastrar)


        btnCadastrar.setOnClickListener {
            if (edtTitulo.text.isEmpty() || edtAutor.text.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val titulo = edtTitulo.text.toString()
            val autor = edtAutor.text.toString()
            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra("TITULO", titulo)
            intent.putExtra("AUTOR", autor)
            startActivity(intent)
            edtTitulo.text.clear()
            edtAutor.text.clear()
            Toast.makeText(this, "Livro cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
        }
        val fabAbrirDetalhes: FloatingActionButton = findViewById(R.id.fabAbrirDetalhes)

        fabAbrirDetalhes.setOnClickListener {

            val intent = Intent(this, DetalhesActivity::class.java)
            startActivity(intent)
        }

    }
}
