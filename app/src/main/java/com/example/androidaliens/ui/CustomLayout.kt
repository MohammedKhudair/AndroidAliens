package com.example.androidaliens.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomLayout(
    content: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {

    Layout(content = {}, measurePolicy = { measurables, constraints ->
        measurables
        val placeable = measurables.map {
            it.measure(
                constraints.copy(
                    minWidth = +10,
                    maxWidth = +10
                )
            )
        }

        layout(500, 500) {

            val xPosition = 0
            val yPosition = 0
            placeable
            placeable.map { it.place(xPosition, yPosition) }

        }
    })

}

@Composable
private fun CustomLe() {
    Column(modifier = Modifier.background(Color.Green).width(intrinsicSize = IntrinsicSize.Max)) {

        Text(text = "MAD", Modifier.background(Color.Gray)
            .fillMaxWidth())
        Text(text = "Skills", Modifier.background(Color.Gray)
            .fillMaxWidth())
        Text(text = "Layouts And Modifiers", Modifier.background(Color.Gray)
            .fillMaxWidth())
    }
}

@Preview
@Composable
private fun CustomLePreview() {
    CustomLe()
}