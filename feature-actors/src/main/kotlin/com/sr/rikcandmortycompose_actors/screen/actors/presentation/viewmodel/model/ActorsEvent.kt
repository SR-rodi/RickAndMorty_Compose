package com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model

import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel

sealed interface ActorsEvent {
    class OnClickActors(val actor: ActorUiModel) : ActorsEvent
    object ResetActions : ActorsEvent
}