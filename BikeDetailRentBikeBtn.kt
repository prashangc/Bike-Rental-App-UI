package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun BikeDetailRentBikeBtnCard() {
    NavigationBar(
        containerColor = Color.Black
    ){
        NavigationBarItem(
            selected = true,
            onClick = {
            },
            icon = {
                Text(
                    text = "Book",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(horizontal = 12.dp, vertical = 8.dp),
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                    )
                )
            },
            enabled = true,
            modifier = Modifier
                .width(200.dp)
        )
    }
//    ElevatedButton(
//        onClick = {},
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.Black // Set your desired background color here
//        ),
//        modifier = Modifier
//            .padding(LocalConfiguration.current.screenWidthDp.dp /4)
//            .height(50.dp)
//            .fillMaxWidth()
//            .background(Color.Cyan)
//        ,
//
//    ) {
//        Text(
//            text = "Book",
//            fontWeight = FontWeight.Bold,
//            style = TextStyle(
//                color = Color.White,
//                fontSize = 14.sp,
//            ),
//        )
//    }
}