package com.example.bikerentalapp.features.home.bike.presentation.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BikeDetailsPowerAndPerformanceCard() {
    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier
            .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
        ) {
            BikeInfoMessageCard(
                text = "Horsepower (HP)",
                iconData = Icons.Filled.Build,
                value = "140 / 12,300",
                unit = "HP / RPM"
            )
            BikeInfoMessageCard(
                text = "Torque (Nm)",
                iconData = Icons.Filled.Build,
                value = "80 / 10,250",
                unit = "Nm / RPM"
            )
            BikeInfoMessageCard(
                text = "Top Speed",
                iconData = Icons.Filled.Build,
                value = "246 / 153",
                unit = "MPH / KM"
            )
            BikeInfoMessageCard(
                text = "Acceleration (0-60 mph or 0-100 km/h)",
                iconData = Icons.Filled.Build,
                value = "3.1",
                unit = "seconds",
                hideDivider = true,
            )
        }
    }
}

@Composable
fun BikeDetailsTyresAndBrakesCard() {
    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier
            .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
        ) {
            BikeInfoMessageCard(
                text = "Front Tire",
                iconData = Icons.Filled.Build,
                value = "120/70 ZR17",
                unit = " Pirelli Diablo Rosso III"
            )
            BikeInfoMessageCard(
                text = "Rear Tire",
                iconData = Icons.Filled.Build,
                value = "180/55 ZR17",
                unit = " Pirelli Diablo Rosso III"
            )
            BikeInfoMessageCard(
                text = "Front Brake",
                iconData = Icons.Filled.Build,
                value = "Dual 320 mm floating discs",
                unit = " with Brembo radial calipers"
            )
            BikeInfoMessageCard(
                text = "Rear Brake",
                iconData = Icons.Filled.Build,
                value = "Single 220 mm disc",
                unit = " with Brembo caliper",
            )
            BikeInfoMessageCard(
                text = "ABS (Anti-lock Braking System)",
                iconData = Icons.Filled.Build,
                value = "Bosch 9 Plus ABS",
                unit = " with Rear Lift Mitigation (RLM)",
                hideDivider = true,
            )
        }
    }
}

@Composable
fun BikeDetailsTechAndFeaturesCard() {
    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier
            .padding(
                top = 16.dp,
                start = 16.dp,
                end = 16.dp
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
        ) {
            BikeInfoMessageCard(
                text = "Instrumentation",
                iconData = Icons.Filled.Build,
                value = "TFT display",
                unit = " Full-color"
            )
            BikeInfoMessageCard(
                text = "Connectivity",
                iconData = Icons.Filled.Build,
                value = "Bluetooth, MV Ride",
                unit = " app compatibility"
            )
            BikeInfoMessageCard(
                text = "Rider Aids",
                iconData = Icons.Filled.Build,
                value = "quick shifter & cruise",
                unit = "control"
            )
            BikeInfoMessageCard(
                text = "Lighting",
                iconData = Icons.Filled.Build,
                value = "LED lighting",
                unit = " with cornering lights",
            )
            BikeInfoMessageCard(
                text = "Electronic Suspension",
                iconData = Icons.Filled.Build,
                value = "Marzocchi",
                unit = "ESS",
            )
            BikeInfoMessageCard(
                text = "Ride-by-Wire",
                iconData = Icons.Filled.Build,
                value = "Throtle wires",
                unit = "each side",
                hideDivider = true,
            )
        }
    }
}



@Composable
fun BikeInfoMessageCard(
    text: String,
    value: String,
    unit: String,
    iconData: ImageVector,
    hideDivider: Boolean = false,
) {
    val annotatedString = buildAnnotatedString {
        append(
            AnnotatedString(
                text = value,
                spanStyle = SpanStyle(
                    color = Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            )
        )
        append(" ")
        append(
            AnnotatedString(
                text = unit,
                spanStyle = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp
                )
            )
        )
    }
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .weight(1f)
            ){
                Icon(
                    imageVector = iconData,
                    contentDescription = null,
                    modifier = Modifier
                        .size(16.dp)
                )
                Text(
                    text = text,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .padding(start = 12.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                    )
                )
            }
                Text(
                    text = annotatedString,
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(end = 3.dp),
                    textAlign = TextAlign.End,
                )
        }
        Box(modifier = Modifier.padding(vertical = 4.dp))
        if(!hideDivider)  Divider()
        if(!hideDivider) Box(modifier = Modifier.padding(vertical = 4.dp))
    }
}