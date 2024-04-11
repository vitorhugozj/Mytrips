package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaMyTrips(controleDeNavegacao: NavHostController) {

    var pesquisaState = remember {
        mutableStateOf("")
    }

    Column {
        Surface (
            modifier = Modifier
                .height(300.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.destaque),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()

            )
            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.susana),
                    contentDescription = "",
                    modifier = Modifier
                        .size(70.dp)
                )

                Text(
                    text = "Susanna Hoffs",
                    color = Color.White,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }
            Column (
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .padding(15.dp)
            ){
                Row {
                    Icon(
                        imageVector = Icons.Default.LocationOn ,
                        contentDescription = "",
                        tint = Color.White

                    )
                    Text(
                        text = "You're in Paris",
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = "My Trips",
                    fontSize = 33.sp,
                    fontWeight = FontWeight.W900,
                    color = Color.White
                )

            }
        }

        Column(
            modifier = Modifier
                .padding(top = 14.dp, start = 20.dp, end = 20.dp, bottom = 14.dp)
        ) {
            Text(text = "Categories")
            Spacer(modifier = Modifier.height(8.dp))
            LazyRow{
                items(3){
                    Card(
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                        modifier = Modifier
                            .height(80.dp)
                            .width(120.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.montain),
                                contentDescription = "",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(60.dp)
                            )
                            Text(
                                text = "Mountain",
                                color = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Card(
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                        modifier = Modifier
                            .height(80.dp)
                            .width(120.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ski),
                                contentDescription = "",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(60.dp)
                            )
                            Text(
                                text = "Snow",
                                color = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Card(
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFEAABF4)),
                        modifier = Modifier
                            .height(80.dp)
                            .width(120.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxSize()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.beach),
                                contentDescription = "",
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .height(40.dp)
                                    .width(60.dp)
                            )
                            Text(
                                text = "Beach",
                                color = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = pesquisaState.value,
                colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                onValueChange = {
                    pesquisaState.value = it
                },
                placeholder = { Text(text = "Search your destiny") },
                trailingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.lupa),
                        contentDescription = "",
                        modifier = Modifier
                            .height(20.dp)
                            .width(20.dp)
                    )
                },
                shape = RoundedCornerShape(size = 18.dp),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Past Trips")
            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn {
                items(3){
                    Card(
                        elevation = CardDefaults.cardElevation(6.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.london),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "London, 2019",
                                color = Color(0xFFCF06F0)
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                                color = Color(0xFFA09C9C),
                                fontSize = 10.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "18 Feb - 21 Feb",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(14.dp))
                    Card(
                        elevation = CardDefaults.cardElevation(6.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(4.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.porto),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .height(100.dp)
                                    .fillMaxWidth()
                                    .clip(RoundedCornerShape(8.dp))
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Porto, 2022",
                                color = Color(0xFFCF06F0)
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(
                                text = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                                color = Color(0xFFA09C9C),
                                fontSize = 10.sp
                            )
                            Spacer(modifier = Modifier.height(5.dp))
                            Row(
                                horizontalArrangement = Arrangement.End,
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "15 May - 22 May",
                                    color = Color(0xFFCF06F0),
                                    fontSize = 10.sp
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(14.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaMyTrips() {
    MyTripsTheme {
    }
}