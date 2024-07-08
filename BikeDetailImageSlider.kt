package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.bikerentalapp.features.home.data.model.Bikes
import com.example.bikerentalapp.utils.image.CustomCarouselSlider
import com.example.bikerentalapp.utils.image.CustomNetworkImage

@Composable
fun BikeDetailImageSlider(bike: Bikes) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Black)
    ) {
        CustomCarouselSlider(
            hasBorderRadius = false,
            imageList = bike.gallery,
        )
//        CustomNetworkImage(
//            url = bike.image,
//            contentDescription = bike.image,
//        )
        Box(
            modifier = Modifier
                .padding(12.dp)
        ){
            StarRatingSample(
                rating = bike.ratings.toFloat()
            )
        }

    }
}

@Composable
fun LogoCard() {
    Card(
        modifier = Modifier
            .background(Color.Cyan)
            .clip(CircleShape)
            .height(100.dp)
            .width(100.dp)
            .padding(16.dp),

//        contentAlignment = Alignment.BottomCenter,

    ){
        CustomNetworkImage(
            url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/MV_Agusta_Logo.svg/1200px-MV_Agusta_Logo.svg.png",
            contentDescription = "logo"
        )
//        Box(
//            modifier = Modifier
//                .align(Alignment.TopCenter)
//                .padding(16.dp)
//        ) {
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                IconButton(onClick = { /* Handle back action */ }) {
//                    Icon(painterResource(id = R.drawable.ic_logo), contentDescription = "Search")
//                }
//                Spacer(modifier = Modifier.weight(1f))
//                IconButton(onClick = { /* Handle search action */ }) {
//                    Icon(painterResource(id = R.drawable.ic_logo), contentDescription = "Search")
//                }
//                IconButton(onClick = { /* Handle favorite action */ }) {
//                    Icon(painterResource(id = R.drawable.ic_logo), contentDescription = "Favorite")
//                }
//                IconButton(onClick = { /* Handle menu action */ }) {
//                    Icon(painterResource(id = R.drawable.ic_logo), contentDescription = "Menu")
//                }
//            }
//        }
    }
}