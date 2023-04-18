package com.sr.rikcandmortycompose_actors.root.data.api

import com.sr.rikcandmortycompose_actors.root.data.dto.ActorDto
import com.sr.rikcandmortycompose_actors.root.data.dto.ResponseActorsDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ActorsApi {

    @GET(CHARACTER)
    suspend fun getCharacter(@Query("page") page: Int): ResponseActorsDto

    @GET(CHARACTER + ID)
    suspend fun getCharacterByID(@Path("id") characterId: Int): ActorDto

    private companion object {
        const val CHARACTER = "character"
        const val ID = "/{id}"
    }

}