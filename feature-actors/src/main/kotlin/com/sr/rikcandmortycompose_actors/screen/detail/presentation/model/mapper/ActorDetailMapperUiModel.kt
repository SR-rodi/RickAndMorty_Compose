package com.sr.rikcandmortycompose_actors.screen.detail.presentation.model.mapper

import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel
import com.sr.rikcandmortycompose_actors.root.data.ActorGender
import com.sr.rikcandmortycompose_actors.root.data.ActorStatus
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.model.ActorDetailUiModel

class ActorDetailMapperUiModel {

    fun mapToUi(domainModel: ActorDomainModel) =
        ActorDetailUiModel(
            gender = domainModel.gender,
            id = domainModel.id,
            image = domainModel.image,
            location = domainModel.location,
            name = domainModel.name,
            status = domainModel.status,
            created = domainModel.created,
            episode = domainModel.episode,
            originName = domainModel.originName,
            species = domainModel.species,
            type = domainModel.type,
            url = domainModel.url,
            statusIconId = ActorStatus.getStatusIcon(domainModel.status),
            genderIconId = ActorGender.getGenderIcon(domainModel.gender),
        )

}