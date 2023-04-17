package com.sr.rikcandmortycompose_actors.actors.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent

class ActorsViewModel(
    private val actorsRepository: ActorsRepository,
) : ViewModel() {

    val actors = MutableStateFlow(emptyList<ActorDomainModel>())

    init {
        getAllActors()
    }

    private fun getAllActors() =
        viewModelScope.launch {
            actors.value = actorsRepository.getActors()
        }
}