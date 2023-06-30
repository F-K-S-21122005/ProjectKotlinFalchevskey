package com.example.screens.player.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.screens.player.impl.MainScreen
import com.example.screens.player.impl.R

@Preview
@Composable
internal fun AppBar() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .padding(10.dp, 15.dp, 25.dp, 15.dp)
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_back_24px),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(23.dp)

            )
            Spacer(modifier = Modifier.width(23.dp))

            Text(
                text = "Player Info",
                fontSize = 20.sp,
            )
        }


    }
}

