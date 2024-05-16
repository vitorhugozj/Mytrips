package br.senai.sp.jandira.mytrips.repositorio

import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.compose.runtime.Composable
import br.senai.sp.jandira.mytrips.dao.UserDao
import br.senai.sp.jandira.mytrips.model.Usuario

class UsuarioRepository(context: Context) {

    private val dao = UserDao.getBancoDeDados(context).ContatoDao()

    fun salvar(usuario: Usuario): Long{
        return dao.salvar(usuario)
    }

    @Composable
    fun listarUsuarios(): List<Usuario>{
        return dao.listarTodosContatos()
    }

    fun verificarCampos(email: String, senha: String): Boolean{
        val usuario = dao.buscarEmail(email)
        return usuario != null && usuario.senha == senha
    }
}