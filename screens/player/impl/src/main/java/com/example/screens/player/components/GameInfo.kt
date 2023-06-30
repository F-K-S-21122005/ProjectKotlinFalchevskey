package com.example.screens.player.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
internal fun GameInfo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(20.dp)
            )
    )

    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)
        ) {
            Row {
                Text(
                    text = "MMR",
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.width(245.dp))
                Text(
                    text = "2500",
                    fontSize = 20.sp
                )

            }

            Spacer(modifier = Modifier.height(25.dp))

            Row {
                Text(
                    text = "Wins",
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.width(250.dp))
                Text(
                    text = "886",
                    fontSize = 20.sp
                )

            }
            Spacer(modifier = Modifier.height(25.dp))
            Row {
                Text(
                    text = "Loses",
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.width(245.dp))
                Text(
                    text = "774",
                    fontSize = 20.sp
                )

            }
            Spacer(modifier = Modifier.height(25.dp))
            Row {
                Text(
                    text = "Win rate %",
                    fontSize = 20.sp,
                )
                Spacer(modifier = Modifier.width(185.dp))
                Text(
                    text = "66.87",
                    fontSize = 20.sp
                )

            }
        }
    }


}