package com.ingmicha.android.compose.app.movie.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ingmicha.android.compose.app.movie.screens.detail.DetailsScreen
import com.ingmicha.android.compose.app.movie.screens.home.HomeScreen
import com.ingmicha.compose.template.navigation.MovieScreens

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(
            MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        ) { backStackEntry ->

            Log.d("TAG","Movie selected ${backStackEntry.arguments}")

            DetailsScreen(
                navController = navController,
                backStackEntry.arguments?.getString("movie")
            )
        }

    }
}