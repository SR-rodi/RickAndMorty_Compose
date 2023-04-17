package com.sr.rikcandmortycompose_actors.root.domain

import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

interface ActorsRepository {

    suspend fun getActors(): List<ActorDomainModel>

}