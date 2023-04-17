package com.sr.rickandmortycompose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider


@Composable
fun RickAndMortyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {

    MaterialTheme {
        CompositionLocalProvider(
            LocalColorProvider provides darkPalette,
            LocalFontProvider provides fonts ,
            content = content
        )
    }
}

object Theme {
    val colors: RickAndMortyColor
        @Composable
        get() = LocalColorProvider.current
    val fonts: RickAndMortyFont
        @Composable
        get() = LocalFontProvider.current
}
