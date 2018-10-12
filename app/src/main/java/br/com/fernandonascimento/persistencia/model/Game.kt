package br.com.fernandonascimento.persistencia.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Game(
        @PrimaryKey(autoGenerate = true) var id: Int?,
        var nome: String,
        var genero: String?,
        var plataforma: String
)