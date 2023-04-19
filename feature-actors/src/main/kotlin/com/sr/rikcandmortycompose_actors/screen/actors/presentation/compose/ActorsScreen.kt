package com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose

import androidx.compose.runtime.Composable
import androidx.paging.compose.collectAsLazyPagingItems
import com.sr.rickandmortycompose.NavigationTree
import com.sr.rickandmortycompose.Screen
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose.view.ActorsView
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.ActorsViewModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsActions
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsEvent
import org.koin.androidx.compose.koinViewModel
import ru.alexgladkov.odyssey.compose.extensions.push

@Composable
fun ActorsScreen(viewModel: ActorsViewModel = koinViewModel()) {


    Screen(viewModel = viewModel) { state, action, rootController ->
        val pagerState = state.state.collectAsLazyPagingItems()

       ActorsView(pagerState) { event -> viewModel.obtainEvent(event) }

        when (action) {
            is ActorsActions.OpenDetailActor -> {
                rootController.push(
                    screen = NavigationTree.Actors.Detail.name,
                    params = action.actorId
                )
                viewModel.obtainEvent(ActorsEvent.ResetActions)
            }
            null -> {}
        }
    }
}