package com.sr.rikcandmortycompose_actors.screen.actors.domain

import androidx.paging.PagingData
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel
import kotlinx.coroutines.flow.Flow

interface ActorsUseCase {

    fun getActorsByPage(): Flow<PagingData<ActorDomainModel>>
}