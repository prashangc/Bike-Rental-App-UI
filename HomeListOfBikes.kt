package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bikerentalapp.features.home.bike.data.repository.BikesRepository
import com.example.bikerentalapp.features.home.data.model.Bikes
import com.example.bikerentalapp.features.splash.data.model.SplashScreenModel
import com.example.bikerentalapp.utils.image.CustomNetworkImage
import com.example.bikerentalapp.utils.ratings.StarRatingBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeListOfBikes(navController: NavHostController) {
    val bikesRepo = BikesRepository()
    val bikes by produceState<List<Bikes>>(initialValue = emptyList()) {
        value = bikesRepo.getAllBikes()
    }

    LazyColumn(
        modifier = Modifier
            .padding(top = 12.dp)
            .fillMaxSize()
        .height(LocalConfiguration.current.screenHeightDp.dp),
        userScrollEnabled = false
    ){
        items(bikes.count()){
            i ->
            Card(
                modifier = Modifier
                    .padding(bottom = 12.dp),
                onClick = {
                    navController.navigate(SplashScreenModel.BikeDetailPage.route)
                }
            ){
                BikeCard(bikes = bikes[i])
            }
        }
    }
}


@Composable
fun BikeCard(bikes: Bikes) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        shape = RoundedCornerShape(32.dp),
        ){
        CustomNetworkImage(
            url = bikes.image,
            contentDescription = bikes.bike,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
        )
        Row(
            modifier = Modifier
                .background(Color.Black)
                .padding(horizontal = 32.dp, vertical = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                text = bikes.bike,
                color = Color.White,
            )
            StarRatingSample(rating = bikes.ratings.toFloat())
        }
    }
}

@Composable
fun StarRatingSample(rating: Float) {
    StarRatingBar(
        maxStars = 5,
        rating = rating,
        onRatingChanged = {}
    )
}