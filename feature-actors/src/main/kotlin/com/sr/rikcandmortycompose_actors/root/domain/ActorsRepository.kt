package com.sr.rikcandmortycompose_actors.root.domain

import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

interface ActorsRepository {

    suspend fun getActors(page:Int): List<ActorDomainModel>

    suspend fun getActorById(actorId: Int): ActorDomainModel

}