package com.example.basicstatecodelab

import com.example.basicstatecodelab.WellnessTasksList
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier
) {
    val tasks = getWellnessTasks()

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        WellnessTasksList(
            list = tasks,
            modifier = Modifier.fillMaxSize()
        )
    }
}