package com.example.myhorsecollection.ui

data class Horse(val name: String,
                 val resource: Int,
                 val sex: Sex,
                 val father: String,
                 val mother: String)

enum class Sex {
    MALE,
    FEMALE
}