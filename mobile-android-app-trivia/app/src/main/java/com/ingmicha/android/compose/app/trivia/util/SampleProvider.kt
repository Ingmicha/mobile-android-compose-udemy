package com.ingmicha.android.compose.app.trivia.util

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import com.ingmicha.android.compose.app.trivia.model.QuestionItem

class SampleQuestionItemProvider : PreviewParameterProvider<QuestionItem> {
    override val values = sequenceOf(
        QuestionItem(
            "Example Answer",
            "Example Category",
            listOf("Choice one", "Choice Two"),
            "Example Question"
        )
    )
}

class SampleMutableIntProvider : PreviewParameterProvider<MutableState<Int>> {
    override val values = sequenceOf(mutableStateOf(0))
}