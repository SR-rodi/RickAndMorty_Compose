package com.sr.rickandmortycompose.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

class RickAndMortyColor(
    val blackA: Color,
    val blackB: Color,
    val darkGray: Color,
    val blueA: Color,
    val blueB: Color,
    val pear: Color,
    val white: Color,
    val text: Color
)

val darkPalette = RickAndMortyColor(
    blackA = Color(0xFF1A1A1A),
    blackB = Color(0xFF1E1E20),
    darkGray = Color(0xFF313234),
    blueA = Color(0xFF11B0C8),
    blueB = Color(0xFF42B4CA),
    pear = Color(0xFFBFDE42),
    white = Color(0xFFFFFFFF),
    text = Color(0xFFFFFFFF),
)

val LocalColorProvider =
    staticCompositionLocalOf<RickAndMortyColor> { error("No default implementation") }