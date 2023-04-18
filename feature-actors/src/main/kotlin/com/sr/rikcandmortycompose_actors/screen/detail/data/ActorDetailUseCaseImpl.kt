package com.sr.rikcandmortycompose_actors.screen.detail.data

import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.screen.detail.domain.ActorDetailUseCase

class ActorDetailUseCaseImpl(private val repository: ActorsRepository) : ActorDetailUseCase {

    override suspend fun getActorById(actorId: Int) = repository.getActorById(actorId = actorId)
}