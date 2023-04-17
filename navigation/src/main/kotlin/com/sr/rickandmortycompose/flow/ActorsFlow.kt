package com.sr.rickandmortycompose.flow

import com.sr.rickandmortycompose.NavigationTree
import com.sr.rikcandmortycompose_actors.actors.presentation.compose.ActorsScreen
import ru.alexgladkov.odyssey.compose.extensions.flow
import ru.alexgladkov.odyssey.compose.extensions.screen
import ru.alexgladkov.odyssey.compose.navigation.RootComposeBuilder

fun RootComposeBuilder.actorsFlow() {
    flow(NavigationTree.Actors.ActorsFlow.name) {
        screen(NavigationTree.Actors.Actors.name) {
            ActorsScreen()
        }
    }
}