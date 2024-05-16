package br.senai.sp.jandira.mytrips.dao

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrips.model.Usuario

@Dao
interface ContatoDao {
    @Insert
    fun salvar(contato: Usuario): Long
    @Update
    fun atualizar(contato: Usuario)
    @Delete
    fun excluir(contato: Usuario)

    @Query("select * from tbl_usuarios where email = :email order by email asc")
    fun buscarEmail(email: String) : Usuario
    @Query("select * from tbl_usuarios where nome = :nome order by nome asc")
    fun buscaPorNome(nome: String) : List<Usuario>

    @Query("select * from tbl_usuarios order by nome asc")
    fun listarTodosContatos() : List<Usuario>

    @Query("select * from tbl_usuarios where id = :id")
    fun buscaPorId(id : Long) : Usuario
}