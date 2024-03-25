package com.example.androidaliens.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidaliens.R


@Composable
fun AndroidAliens() {
    AndroidAlienGrid()

}
@Composable
private fun AndroidAlienGrid(){
    LazyVerticalGrid(columns = GridCells.Fixed(4)) {
        items(500){
            AndroidAlien(color = Color.Green)
        }

    }
}
@Composable
fun AndroidAliensGameOver() {
    Box(modifier = Modifier.fillMaxSize(),
         contentAlignment = Alignment.Center){
        AndroidAlienRow()
        Spacer(
            modifier = Modifier
                .matchParentSize()
                .background(color = Color.Gray.copy(alpha = .7f)))
        Text(text = "Game Over",Modifier.size(18.dp))
    }



}


@Composable
private fun AndroidAlienRow() {
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Top
    ) {
        AndroidAlien(
            color = Color.Red,
            Modifier
                .size(70.dp)
                .weight(1F)
                .padding(4.dp)
        )
        AndroidAlien(
            color = Color.Green,
            Modifier
                .size((2 * 70).dp)
                .weight(2F)
                .padding(4.dp)
        )
        AndroidAlien(
            color = Color.Green,
            Modifier
                .size(70.dp)
                .weight(1F)
                .padding(4.dp)
        )

    }
}

@Composable
private fun AndroidAlienColumn() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AndroidAlien(
            color = Color.Red,
            Modifier
                .size(70.dp)
                .padding(4.dp)
        )
        AndroidAlien(
            color = Color.Green,
            Modifier
                .size(70.dp)
                .padding(4.dp)
        )
    }
}

@Composable
private fun AndroidAlien(
    color: Color,
    modifier: Modifier = Modifier,
) {
    Image(
        modifier = modifier,
        painter = painterResource(id = R.drawable.ic_android_black),
        contentDescription = null,
        colorFilter = ColorFilter.tint(color = color)
    )
}

@Composable
@Preview()
fun PreviewAndroidAlien() {
    AndroidAliens()
}