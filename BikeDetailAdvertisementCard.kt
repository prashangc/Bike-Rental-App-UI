package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bikerentalapp.utils.image.CustomNetworkImage

@Composable
fun BikeDetailAdvertisementCard() {
    Card(
        modifier = Modifier
            .padding(
                top= 16.dp,
                start = 16.dp,
                end = 16.dp
            ),
        shape = RoundedCornerShape(24.dp),
    ) {
        Row {
            Box(
               modifier = Modifier
                   .weight(2f)
                   .height(110.dp)
                   .background(color = Color.Black)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        ) {
                        Icon(
                            imageVector = Icons.Default.Settings,
                            contentDescription = "settings",
                            modifier = Modifier
                                .padding(5.dp),
                            tint = Color.White
                        )
                        Box(modifier = Modifier.padding(start = 2.dp))
                        Text(
                            text = "Newly Launched",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                )
                            )
                         }
                        Text(
                            text = "Hypher Performance ( Potent 1090 cc DTS i - performance, weight about 200kgs of muscle swift aroudn the sharpest bends. )",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 12.sp,
                            ),
                            textAlign = TextAlign.Justify,
                        )
                }
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color.Red)
            ){
                CustomNetworkImage(
                    url = "https://cdn-icons-png.flaticon.com/512/1260/1260218.png",
                    contentDescription = "ad",
                    modifier = Modifier
                        .height(110.dp)
                        .padding(25.dp)
                )

            }
        }
    }
}