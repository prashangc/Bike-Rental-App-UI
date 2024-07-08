package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bikerentalapp.utils.textform.CustomTextForm

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeSearchField() {
    val search by remember {mutableStateOf("") }
    Box(
        modifier = Modifier
            .padding(top = 12.dp)
    ){
        CustomTextForm(
            value = search,
            hintText = "Search bikes...",
            leadingIcon = Icons.Filled.Search
        )
    }
}