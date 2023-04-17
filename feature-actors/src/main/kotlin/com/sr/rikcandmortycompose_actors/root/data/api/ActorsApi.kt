package com.sr.rikcandmortycompose_actors.root.data.api

import com.sr.rikcandmortycompose_actors.root.data.dto.ResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface ActorsApi {

    @GET(CHARACTER)
    suspend fun getCharacter(@Query("page") page: Int = DEFAULT_PAGE):ResponseDto

    private companion object {
        const val CHARACTER = "character"
        const val DEFAULT_PAGE = 1
    }

}