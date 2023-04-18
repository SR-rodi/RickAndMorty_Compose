package com.sr.rikcandmortycompose_actors.screen.detail.domain

import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

interface ActorDetailUseCase {

    suspend fun getActorById(actorId:Int):ActorDomainModel
}