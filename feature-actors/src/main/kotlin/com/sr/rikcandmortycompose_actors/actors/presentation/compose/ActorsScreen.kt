package com.sr.rikcandmortycompose_actors.actors.presentation.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.sr.rikcandmortycompose_actors.actors.presentation.compose.view.ActorsView
import com.sr.rikcandmortycompose_actors.actors.presentation.viewmodel.ActorsViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun ActorsScreen(viewModel: ActorsViewModel = koinViewModel()) {
    val state = viewModel.actors.collectAsState()
    ActorsView(state.value)
}