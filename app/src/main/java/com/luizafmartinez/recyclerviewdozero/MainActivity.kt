package com.luizafmartinez.recyclerviewdozero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvConversas: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvConversas = findViewById(R.id.rv_conversas)

        val lista = listOf(
            Conversa("Jamilton","<imagem_perfil>"),
            Conversa("Ana",     "<imagem_perfil>"),
            Conversa("Pedro",   "<imagem_perfil>"),
            Conversa("João",    "<imagem_perfil>"),
            Conversa("Maria",   "<imagem_perfil>"),
            Conversa("Cristina","<imagem_perfil>"),
        )

        //Adaptador de Dados
        rvConversas.adapter = ConversasAdapter( lista )

        //Gerenciador de Layout
        rvConversas.layoutManager = LinearLayoutManager(
            this, RecyclerView.VERTICAL, false)





    }
}