package com.sr.rikcandmortycompose_actors.root.data.repository

import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.mapper.ActorMapper
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

class ActorsRepositoryImpl(
    private val actorsApi: ActorsApi,
    private val mapper:ActorMapper
): ActorsRepository {

    override suspend fun getActors(): List<ActorDomainModel> {
        val actors = actorsApi.getCharacter().results
        return mapper.mapToDomain(actors)
    }

}