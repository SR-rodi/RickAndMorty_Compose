package com.sr.rikcandmortycompose_actors.screen.actors.presentation.compose.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.sr.rickandmortycompose.items
import com.sr.rickandmortycompose.theme.Theme
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsEvent

@Composable
fun ActorsView(state: LazyPagingItems<ActorUiModel>, eventHandler: (event: ActorsEvent) -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        val isLoading = state.loadState.refresh == LoadState.Loading
        if (isLoading) CircularProgressIndicator(color = Theme.colors.blueA)
        else ActorsGridView(state, eventHandler)
    }
}

@Composable
fun ActorsGridView(
    state: LazyPagingItems<ActorUiModel>,
    eventHandler: (event: ActorsEvent) -> Unit,
) = LazyVerticalGrid(
    verticalArrangement = Arrangement.spacedBy(8.dp),
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    columns = GridCells.Adaptive(minSize = 164.dp)
) {
    items(state) { item ->
        if (item != null) ActorsCardView(item, eventHandler)
    }
}