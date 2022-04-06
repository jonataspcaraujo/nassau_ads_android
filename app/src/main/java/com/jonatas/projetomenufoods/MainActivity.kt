package com.jonatas.projetomenufoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupView()


    }

    private fun setupView() {
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botao_register)
        botao.setOnClickListener {
            Toast.makeText(this,"Login realizado com sucesso",Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}