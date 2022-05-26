package com.example.myhorsecollection.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun HorseItemView(horse: Horse) {
    Column {
        Image(painter = painterResource(id = horse.resource), contentDescription = "")
        Text(text = horse.name)
        Text(text = horse.father)
        Text(text = horse.mother)
    }
}