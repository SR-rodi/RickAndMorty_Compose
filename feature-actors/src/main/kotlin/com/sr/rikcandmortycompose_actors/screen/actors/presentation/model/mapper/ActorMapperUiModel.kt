package com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.mapper

import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

class ActorMapperUiModel {

    fun mapToUi(listDto: List<ActorDomainModel>) = listDto.map { domainModel ->
        ActorUiModel(
            gender = domainModel.gender,
            id = domainModel.id,
            image = domainModel.image,
            location = domainModel.location,
            name = domainModel.name,
            status = domainModel.status,
        )
    }

    fun mapToUi(domainModel: ActorDomainModel) = ActorUiModel(
        gender = domainModel.gender,
        id = domainModel.id,
        image = domainModel.image,
        location = domainModel.location,
        name = domainModel.name,
        status = domainModel.status,
    )

}