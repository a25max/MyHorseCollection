package com.example.myhorsecollection.ui

import androidx.lifecycle.ViewModel
import com.example.myhorsecollection.R

class MainViewModel: ViewModel() {

    val horseList = listOf(
        Horse(
            name = "ガンバリーレ",
            resource = R.drawable.ganbarire,
            sex = Sex.MALE,
            father = "サトノアラジン",
            mother = "ティノ"
        ),
        Horse(
            name = "アンジェリカル",
            resource = R.drawable.ange,
            sex = Sex.FEMALE,
            father = "ドゥラメンテ",
            mother = "アンジェリック"
        ),
        Horse(
            name = "マロンアルジャン",
            resource = R.drawable.marron,
            sex = Sex.FEMALE,
            father = "エピファネイア",
            mother = "シルヴァースプーン"
        )
    )

}