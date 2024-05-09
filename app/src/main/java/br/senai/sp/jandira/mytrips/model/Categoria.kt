package br.senai.sp.jandira.mytrips.model

import android.media.Image
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector


data class Categoria(
    var id: Int = 0,
    var nome: String = "",
    var image: Painter? = null
)

