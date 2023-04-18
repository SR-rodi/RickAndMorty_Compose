package com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel

import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import androidx.paging.map
import com.sr.rickandmortycompose.BaseViewModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.mapper.ActorMapperUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsActions
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsEvent
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model.ActorsState
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.screen.actors.domain.ActorsUseCase
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.map

class ActorsViewModel(
    private val uiMapper: ActorMapperUiModel,
    private val actorsUseCase: ActorsUseCase,
) : BaseViewModel<ActorsState, ActorsActions, ActorsEvent>(ActorsState(emptyFlow())) {

    init {
        getAllActors()
    }

    private fun getAllActors() {
        val flow = actorsUseCase.getActorsByPage().map { pagingData ->
            pagingData.map { actor -> uiMapper.mapToUi(actor) }
        }.cachedIn(viewModelScope)
        viewState = viewState.copy(state = flow)
    }

    override fun obtainEvent(viewEvent: ActorsEvent) {

        when (viewEvent) {
            is ActorsEvent.OnClickActors -> onClickActor(viewEvent.actor)
            ActorsEvent.ResetActions -> onResetAction()
        }
    }

    private fun onClickActor(actor: ActorUiModel) {
        viewAction = ActorsActions.OpenDetailActor(actorId = actor.id)
    }
}

