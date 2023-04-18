package com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel

import com.sr.rickandmortycompose.BaseViewModel
import com.sr.rikcandmortycompose_actors.screen.detail.domain.ActorDetailUseCase
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.model.ActorDetailUiModel
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.model.mapper.ActorDetailMapperUiModel

class DetailActorViewModel(
    private val detailUseCase: ActorDetailUseCase,
    private val mapper: ActorDetailMapperUiModel,
) : BaseViewModel<DetailActorState, DetailActorAction, DetailActorEvent>(DetailActorState()) {

    override fun obtainEvent(viewEvent: DetailActorEvent) {

        when (viewEvent) {
            is DetailActorEvent.OnStartScreen -> onStartScreen(viewEvent.actorId)
        }

    }

    private fun onStartScreen(actorId: Int) {
        scopeLaunch(
            onLoading = { viewState = viewState.copy(isError = false, isLoading = true) },
            onError = { viewState = viewState.copy(isError = true, isLoading = false) },
            onSuccess = { viewState = viewState.copy(isError = false, isLoading = false) },
        ) {
            viewState =
                viewState.copy(actor = mapper.mapToUi(detailUseCase.getActorById(actorId = actorId)))
        }
    }
}

data class DetailActorState(
    val isError: Boolean = false,
    val isLoading: Boolean = false,
    val actor: ActorDetailUiModel? = null,
)

sealed interface DetailActorEvent {
    class OnStartScreen(val actorId: Int) : DetailActorEvent
}

sealed interface DetailActorAction {}