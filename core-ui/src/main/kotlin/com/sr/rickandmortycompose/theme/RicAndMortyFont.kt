package com.sr.rickandmortycompose.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

class RickAndMortyFont(
    h1: TextStyle = baseFontStyle(textSize = 48.sp, weight = FontWeight.ExtraBold),
    h2: TextStyle = baseFontStyle(textSize = 32.sp, weight = FontWeight.Normal),
    h3: TextStyle = baseFontStyle(textSize = 24.sp, weight = FontWeight.SemiBold),
    h4: TextStyle = baseFontStyle(textSize = 16.sp, weight = FontWeight.Normal),
    p: TextStyle = baseFontStyle(textSize = 14.sp, weight = FontWeight.Light),
)

private fun baseFontStyle(textSize: TextUnit, weight: FontWeight) = TextStyle(
    fontSize = textSize,
    fontWeight = weight,
)

val fonts = RickAndMortyFont()

val LocalFontProvider =
    staticCompositionLocalOf<RickAndMortyFont> { error("No default implementation") }