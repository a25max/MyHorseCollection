package com.example.myhorsecollection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myhorsecollection.ui.Horse
import com.example.myhorsecollection.ui.HorseItemView
import com.example.myhorsecollection.ui.MainViewModel
import com.example.myhorsecollection.ui.Sex
import com.example.myhorsecollection.ui.theme.MyHorseCollectionTheme

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyHorseCollectionTheme {
                LazyVerticalGrid(cells = GridCells.Adaptive(minSize = 200.dp)) {
                    items(viewModel.horseList) { horse ->
                        HorseItemView(horse = horse)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyHorseCollectionTheme {
        Greeting("Android")
    }
}