package com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.mapper

import com.sr.rikcandmortycompose_actors.root.data.ActorGender
import com.sr.rikcandmortycompose_actors.root.data.ActorStatus
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.ActorUiModel

class ActorMapperUiModel {

    fun mapToUi(listDto: List<ActorDomainModel>) = listDto.map { domainModel ->
        ActorUiModel(
            gender = domainModel.gender,
            id = domainModel.id,
            image = domainModel.image,
            location = domainModel.location,
            name = domainModel.name,
            status = domainModel.status,
            statusIconId = ActorStatus.getStatusIcon(actorStatus = domainModel.status),
            genderIconId = ActorGender.getGenderIcon(domainModel.gender)
        )
    }

    fun mapToUi(domainModel: ActorDomainModel) = ActorUiModel(
        gender = domainModel.gender,
        id = domainModel.id,
        image = domainModel.image,
        location = domainModel.location,
        name = domainModel.name,
        status = domainModel.status,
        statusIconId = ActorStatus.getStatusIcon(actorStatus = domainModel.status),
        genderIconId = ActorGender.getGenderIcon(domainModel.gender)
    )

}

