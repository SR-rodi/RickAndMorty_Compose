package com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.items
import com.sr.rickandmortycompose.NavigationTree
import com.sr.rickandmortycompose.Screen
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose.view.ActorsCardView
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

fun <T : Any>LazyGridScope.items(
    items: LazyPagingItems<T>,
    key: ((item: T) -> Any)? = null,
    itemContent: @Composable LazyGridScope.(value: T?) -> Unit
){
        items(
            count = items.itemCount,
            key = if (key == null) null else { index ->
                val item = items.peek(index)
                if (item != null) key(item)
            }
        ) { index ->
            this@items.itemContent(items[index])
        }

}