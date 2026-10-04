package com.example.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.basicstatecodelab.WellnessTask
import com.example.basicstatecodelab.WellnessTaskItem

@Composable
fun WellnessTasksList(
    list: List<WellnessTask>,
    modifier: Modifier = Modifier
) {
    var tasks by remember { mutableStateOf(list) }

    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = tasks,
            key = { task -> task.id }
        ) { task ->

            var checked by remember { mutableStateOf(false) }

            WellnessTaskItem(
                task = task,
                checked = checked,
                onCheckedChange = { checked = it },
                onClose = {
                    tasks = tasks.filter { it.id != task.id }
                }
            )
        }
    }
}