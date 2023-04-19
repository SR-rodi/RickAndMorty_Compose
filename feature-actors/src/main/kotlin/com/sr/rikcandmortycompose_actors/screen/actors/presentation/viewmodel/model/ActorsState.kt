package com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model

import androidx.paging.PagingData
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import kotlinx.coroutines.flow.Flow

data class ActorsState(val state: Flow<PagingData<ActorUiModel>>)