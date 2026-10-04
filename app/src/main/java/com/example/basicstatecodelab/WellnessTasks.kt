package com.example.basicstatecodelab


fun getWellnessTasks() = List(30) { index ->
    WellnessTask(index, "Task #$index")
}