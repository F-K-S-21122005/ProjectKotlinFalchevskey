package com.example.utils


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
internal fun UserCard(

) {
    Box(
        modifier = Modifier
            .clickable(onClick = { /* TODO() */ })
            .fillMaxWidth()
            .background(
                Color.Green,
                shape = RoundedCornerShape(20.dp)
            )

    )
    {
        Column(modifier = Modifier.padding(15.dp, 0.dp, 5.dp, 15.dp)) {

            Row()
            {
                Image(
                    painter = painterResource(id = R.drawable.logo_icon),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(200.dp)
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp, 5.dp, 0.dp, 5.dp)
                )
                {
                    Text(
                        text = "Nickname",
                        fontSize = 25.sp,
                    )

                    Text(
                        text = "Dyracho",
                        fontSize = 20.sp,
                    )

                    Spacer(modifier = Modifier.height(25.dp))

                    Text(
                        text = "Last Game",
                        fontSize = 25.sp,
                    )
                    Text(
                        text = "12 hours ago",
                        fontSize = 20.sp,
                    )
                }
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Profile Link")

            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Steam Profile Link")

            }


        }
    }


}