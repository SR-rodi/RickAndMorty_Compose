package com.sr.rikcandmortycompose_actors.screen.actors.domain

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.mapper.ActorMapperDomainModel
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel
import com.sr.rikcandmortycompose_actors.screen.actors.domain.ActorsUseCase
import kotlinx.coroutines.flow.Flow

class ActorsUseCaseImpl(private val repository: ActorsRepository) : ActorsUseCase {

    override fun getActorsByPage(): Flow<PagingData<ActorDomainModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20, enablePlaceholders = false
            ),
            pagingSourceFactory = {
                PagerSourceActors(repository)
            }
        ).flow
    }
}