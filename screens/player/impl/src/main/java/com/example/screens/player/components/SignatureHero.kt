package com.example.screens.player.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screens.player.impl.R

@Preview
@Composable
internal fun Hero() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .background(
                color = Color.Red,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(10.dp)
    )
    {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Most played hero",
                fontSize = 20.sp,
            )

            Image(
                painter = painterResource(id = R.drawable.media),
                contentDescription = "image",
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )


            Text(
                text = "Hero name",
                fontSize = 20.sp,
            )

            Text(
                text = "Aabadon",
                fontSize = 15.sp,
            )

        }
    }

}