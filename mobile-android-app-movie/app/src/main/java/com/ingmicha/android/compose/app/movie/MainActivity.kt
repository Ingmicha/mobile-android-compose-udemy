package com.ingmicha.android.compose.app.movie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ingmicha.android.compose.app.movie.navigation.MovieNavigation
import com.ingmicha.android.compose.app.movie.ui.theme.AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaseApp {
                MovieNavigation()
            }
        }
    }
}

@Composable
fun BaseApp(content: @Composable () -> Unit) {
    AppTheme {
        content()
    }
}

@Preview
@Composable
fun MainTopBar() {
    TopAppBar(
        backgroundColor = Color.Transparent,
        elevation = 0.dp
    ) {
        Text(text = "Movies")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BaseApp {
        MovieNavigation()
    }
}