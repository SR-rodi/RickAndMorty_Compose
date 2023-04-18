package com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.model

sealed interface ActorsActions {
    class OpenDetailActor(val actorId: Int) : ActorsActions
}