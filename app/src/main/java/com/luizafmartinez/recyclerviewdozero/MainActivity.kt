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

        //Adaptador de Dados
        rvConversas.adapter = ConversasAdapter()

        //Gerenciador de Layout
        rvConversas.layoutManager = LinearLayoutManager(
            this, RecyclerView.VERTICAL, false)





    }
}