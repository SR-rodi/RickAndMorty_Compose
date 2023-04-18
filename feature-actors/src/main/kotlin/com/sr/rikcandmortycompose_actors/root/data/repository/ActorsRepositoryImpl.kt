package com.sr.rikcandmortycompose_actors.root.data.repository

import android.util.Log
import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.mapper.ActorMapperDomainModel
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

class ActorsRepositoryImpl(
    private val actorsApi: ActorsApi,
    private val mapper: ActorMapperDomainModel,
) : ActorsRepository {

    override suspend fun getActors(page: Int): List<ActorDomainModel> {
        val actors = actorsApi.getCharacter(page).results
        return mapper.mapToDomain(actors)
    }


    override suspend fun getActorById(actorId: Int): ActorDomainModel {
        val actor = actorsApi.getCharacterByID(actorId)
        return mapper.mapToDomain(actor)
    }

}