package com.sr.rickandmortycompose

import com.sr.rickandmortycompose.flow.actorsFlow
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.generateGraph() {
    actorsFlow()
}