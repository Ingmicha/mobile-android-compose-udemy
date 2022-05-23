package com.ingmicha.android.compose.app.movie.utils

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.ingmicha.android.compose.app.movie.model.Movie
import com.ingmicha.android.compose.app.movie.model.getMovies


class SampleStringProvider : PreviewParameterProvider<String> {
    override val values = sequenceOf("Sample String")
}

class SampleMovieProvider : PreviewParameterProvider<Movie> {
    override val values = sequenceOf(getMovies()[0])
}