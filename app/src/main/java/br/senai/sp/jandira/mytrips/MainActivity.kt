package br.senai.sp.jandira.mytrips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.mytrips.screens.TelaLogin
import br.senai.sp.jandira.mytrips.screens.TelaMyTrips
import br.senai.sp.jandira.mytrips.screens.TelaSignUp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "login"
                    ){
                        composable(route="login"){ TelaLogin(controleDeNavegacao) }
                        composable(route = "sign"){ TelaSignUp(controleDeNavegacao)}
                        composable(route="home"){ TelaMyTrips(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}


