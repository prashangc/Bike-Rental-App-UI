package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BikeDetailsTabBar() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Power &\nPerformance", "Brakes &\nTyres", "Tech &\nFeatures")

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top= 16.dp, start = 16.dp, end = 16.dp)
    ) {
        TabRow(
            backgroundColor = Color.Transparent,
            contentColor = Color.Red,
            indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.tabIndicatorOffset(tabPositions[tabIndex])
            )
        },
        selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = {
                        Text(
                            text = title,
                            style = TextStyle(
                                fontSize = 12.sp
                            ),
                            textAlign = TextAlign.Center,
                        )
                    },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index },
                    icon = {
                        when (index) {
                            0 -> Icon(imageVector = Icons.Default.Info, contentDescription = null)
                            1 -> Icon(imageVector = Icons.Default.Settings, contentDescription = null)
                            2 -> Icon(imageVector = Icons.Default.Star, contentDescription = null)
                        }
                    },
                    unselectedContentColor = Color.DarkGray.copy(alpha = 0.4f),
                    selectedContentColor = Color.Black,
                    modifier = Modifier
                        .background(color= Color.Transparent)
                )
            }

        }
        when (tabIndex) {
            0 -> BikeDetailsPowerAndPerformanceCard()
            1 -> BikeDetailsTyresAndBrakesCard()
            2 -> BikeDetailsTechAndFeaturesCard()
        }
    }
}