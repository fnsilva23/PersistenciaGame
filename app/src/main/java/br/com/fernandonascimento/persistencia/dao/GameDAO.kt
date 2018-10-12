package br.com.fernandonascimento.persistencia.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import br.com.fernandonascimento.persistencia.model.Game

@Dao
interface GameDAO {
    @Insert
    fun inserir(game: Game)

    @Query("SELECT * FROM GAME")
    fun lerGames(): LiveData<List<Game>>

    @Query("SELECT * FROM GAME WHERE id = :id")
    fun buscarPor(id: Int) : Game

    @Update
    fun atualizar(game: Game)

    @Delete
    fun apagar(game: Game)
}