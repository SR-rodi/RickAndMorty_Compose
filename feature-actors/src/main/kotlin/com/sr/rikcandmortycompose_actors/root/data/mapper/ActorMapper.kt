package com.sr.rikcandmortycompose_actors.root.data.mapper

import com.sr.rikcandmortycompose_actors.root.data.dto.ActorDto
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

class ActorMapper {

    fun mapToDomain(listDto: List<ActorDto>) = listDto.map { dto ->
        ActorDomainModel(
            created = dto.created,
            episode = dto.episode,
            gender = dto.gender,
            id = dto.id,
            image = dto.image,
            location = dto.location.name,
            name = dto.name,
            originName = dto.origin.name,
            species = dto.species,
            status = dto.status,
            type = dto.type,
            url = dto.url
        )
    }
}