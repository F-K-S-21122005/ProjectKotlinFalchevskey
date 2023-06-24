package com.example.screens.player.impl

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val f = 8
    Scaffold(
        modifier = Modifier
            .fillMaxSize()


    ) {
        Column {
            Search()

            Spacer(modifier = Modifier.height(10.dp))

            User()

            Spacer(modifier = Modifier.height(15.dp))

            GameInfo()

            Hero()


        }
    }
}

@Preview
@Composable
private fun Search() {

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

@Preview
@Composable
private fun User(

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
                    painter = painterResource(id = R.drawable.dota2_logo_icon),
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

@Preview
@Composable
fun GameInfo() {
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

@Preview
@Composable
fun Hero() {

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


@Preview
@Composable
fun MainScreenPreview() {
    MaterialTheme {
        MainScreen()
    }
}