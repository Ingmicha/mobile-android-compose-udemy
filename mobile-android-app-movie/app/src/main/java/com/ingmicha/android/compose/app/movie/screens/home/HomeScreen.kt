package com.ingmicha.android.compose.app.movie.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.ingmicha.android.compose.app.movie.MainTopBar
import com.ingmicha.android.compose.app.movie.model.Movie
import com.ingmicha.android.compose.app.movie.model.getMovies
import com.ingmicha.android.compose.app.movie.widgets.MovieRow
import com.ingmicha.compose.template.navigation.MovieScreens

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            MainTopBar()
        },
    ) {
        MainContent(navController = navController)
    }
    // A surface container using the 'background' color from the theme
    // content()
}

@Preview
@Composable
fun MainContent(
    navController: NavController = rememberNavController(),
    movieList: List<Movie> = getMovies()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(movie = it) { movie ->
                    navController.navigate(route = MovieScreens.DetailScreen.name + "/$movie")
                }
            }
        }
    }
}