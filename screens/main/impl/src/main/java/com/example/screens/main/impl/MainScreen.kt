package com.example.screens.main.impl

import android.annotation.SuppressLint
import android.widget.Toast
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.impl.R


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    var f = 20
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier
            .fillMaxSize()


    ) {
        Column {
            Search()
            Spacer(modifier = Modifier.height(5.dp))
            LazyColumn(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                items(f) { i ->

                    User()

                }

            }
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
            .padding(25.dp, 15.dp, 25.dp, 15.dp)
    )
    {
        Row(
            modifier = Modifier
                .width(750.dp)
                .background(
                    Color.Red,
                    shape = RoundedCornerShape(24.dp)
                )
                .padding(30.dp, 20.dp, 4.dp, 20.dp),
        ) {
            Text(
                text = "Search for players",
                fontSize = 20.sp,
            )
        }


    }
}

@Preview
@Composable
private fun User() {
    val context = LocalContext.current
    Column(modifier = Modifier.padding(5.dp)) {

        Box(
            modifier = Modifier
                .clickable(onClick = {
                    Toast
                        .makeText(context, "Hello world", Toast.LENGTH_LONG)
                        .show()
                })
                .fillMaxWidth()
                .background(
                    Color.Green,
                    shape = RoundedCornerShape(20.dp)
                )
        )
        {
            Row()
            {
                Image(
                    painter = painterResource(id = R.drawable.monogram),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(10.dp, 5.dp, 0.dp, 5.dp)
                        .size(64.dp)

                )
                Column(
                    modifier = Modifier
                        .padding(12.dp, 5.dp, 0.dp, 5.dp)
                )
                {
                    Text(
                        text = "Nickname",
                        fontSize = 20.sp,
                    )

                    Text(
                        text = "Subhead",
                        fontSize = 20.sp,
                    )
                }
            }
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