package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {

    var capturarEmail = remember {
        mutableStateOf("")
    }

    var capturarSenha = remember {
        mutableStateOf("")
    }

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(130.dp),
                shape = RoundedCornerShape(bottomStart = 15.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFA81DCE))
            ) {}
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )
        {
            Text(
                text = "Login",
                color = Color(0xFFA81DCE),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 55.sp


            )
            Text(
                text = "Please sign in to continue.",
                color = Color(0xFF777677),
                fontSize = 14.sp,

                )

            OutlinedTextField(
                value = capturarEmail.value,
                onValueChange = {
                    capturarEmail.value = it

                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),

                shape = RoundedCornerShape(13.dp),
                modifier = Modifier
                    .padding(0.dp, 50.dp, 0.dp, 20.dp)
                    .fillMaxWidth(),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xFFA81DCE),
                        unfocusedBorderColor = Color(0xFFA81DCE)
                    ),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(20.dp)
                            .width(22.dp)
                    )
                },
                label = {
                    Text(text = "Email")
                }

            )

            OutlinedTextField(
                value = capturarSenha.value,
                onValueChange = {
                    capturarSenha.value = it
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                visualTransformation = PasswordVisualTransformation(

                ),
                modifier = Modifier
                    .fillMaxWidth(),

                colors = OutlinedTextFieldDefaults
                    .colors(
                        focusedBorderColor = Color(0xFFA81DCE),
                        unfocusedBorderColor = Color(0xFFA81DCE)
                    ),
                shape = RoundedCornerShape(13.dp),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.senha),
                        contentDescription = "",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(24.dp)
                            .width(22.dp)
                    )
                },
                label = {
                    Text(text = "Password")
                }

            )

            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = (Color(0xFFA81DCE))),
                    modifier = Modifier
                        .padding(0.dp, 25.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text(
                        text = "SIGN IN",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier
                            .padding(7.dp, 0.dp)
                    )
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        modifier = Modifier
                            .size(30.dp)
                    )

                }
            }
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 20.dp)
            ) {
                Text(text = "Don't have an account?", fontWeight = FontWeight.ExtraLight)
                Text(
                    text = "Sign in",
                    fontWeight = FontWeight.ExtraBold,
                    color = Color(0xFFA81DCE),
                    modifier = Modifier.clickable {
                        controleDeNavegacao.navigate("sign")
                    }
                )
            }


        }

        Row(
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .height(40.dp)
                    .width(130.dp),
                shape = RoundedCornerShape(topEnd = 15.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFA81DCE))
            ) {}
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLogin() {
    MyTripsTheme {
    }
}