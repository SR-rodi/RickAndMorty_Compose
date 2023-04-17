package com.sr.rikcandmortycompose_actors.root.domain.model

import com.sr.rikcandmortycompose_actors.root.data.dto.LocationDto
import com.sr.rikcandmortycompose_actors.root.data.dto.OriginDto

class ActorDomainModel(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: String,
    val name: String,
    val originName: String,
    val species: String,
    val status: String,
    val type: String,
    val url: String,
)