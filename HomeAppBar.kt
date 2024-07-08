package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeAppBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
        ){
            Text(
            text = "Performance Driven\nBike Passion !",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
        )
        HomeProfilePicture()
    }
}

@Composable
fun HomeProfilePicture() {
    Icon(
        imageVector = Icons.Default.Person,
        contentDescription = "profile picture"
    )
}