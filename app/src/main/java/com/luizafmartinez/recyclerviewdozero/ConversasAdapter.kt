package com.luizafmartinez.recyclerviewdozero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ConversasAdapter : Adapter<ConversasAdapter.ConversaViewHolder>() {

    //View Holder   . Esta é a classe que vai criar a conexão com o xml
    inner class ConversaViewHolder( itemView: View ) : ViewHolder(itemView) {

      //private val view = itemView
      val textNome: TextView = itemView.findViewById(R.id.text_nome)
      val imagePerfil: ImageView = itemView.findViewById(R.id.image_perfil)
      //Apontar para Imagem e Texto
    }
    // Herança de View -> item
    // Executado para cada criação de View (Converter XML para objeto do tipo View)
    // onCreateViewHolder vai usar ConversaViewHolder e vai passar o objetoView - itemView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConversaViewHolder {

        // Não temos o setContentView aqui...
        // Temos que inflar o layout (layoutInflater) Converter XML para Objeto View
        // qualquer objeto View tem o contexto

       /*
        val layoutInflater = LayoutInflater.from( parent.context )
        val view = layoutInflater.inflate(
            R.layout.item_conversa, parent, false
        )
        */
        val view = LayoutInflater
            .from( parent.context )
            .inflate(R.layout.item_conversa, parent, false)

        //Retorna uma instância da class ConversaViewHolder
        return ConversaViewHolder(view) //View
    }

    // 1) Verifica a quantidade de itens a serem criados
    override fun getItemCount(): Int { //Recupera a quantidade de itens


    }

    override fun onBindViewHolder(holder: ConversaViewHolder, position: Int) {



    }

}