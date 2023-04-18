package com.sr.rikcandmortycompose_actors.screen.detail.presentation.compose

import androidx.compose.runtime.Composable
import com.sr.rickandmortycompose.Screen
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.compose.view.DetailActorView
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorEvent
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun DetailsActorScreen(actorId: Int, viewModel: DetailActorViewModel = koinViewModel()) {

    viewModel.obtainEvent(DetailActorEvent.OnStartScreen(actorId))

    Screen(viewModel = viewModel) { state, action, _ ->
        DetailActorView(state) {event-> viewModel.obtainEvent(event) }

        when(action){

            else -> {}
        }
    }
}