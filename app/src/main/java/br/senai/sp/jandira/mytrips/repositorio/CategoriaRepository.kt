package br.senai.sp.jandira.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categoria


class CategoriaRepository {
    @Composable
    fun listarTodasCategorias(): List<Categoria> {
        val mountain = Categoria(
            id = 1,
            nome = "Mountain",
            image = painterResource(
                id = R.drawable.montain,)
        )
        val snow = Categoria(
            id = 2,
            nome = "Snow",
            image = painterResource(
                id = R.drawable.ski
            )
        )
        val beach = Categoria(
            id = 3,
            nome = "Beach",
            image = painterResource(
                id = R.drawable.beach
            )
        )
        return listOf(mountain, snow, beach)
    }
}