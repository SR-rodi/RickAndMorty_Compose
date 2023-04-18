package com.sr.rikcandmortycompose_actors.screen.actors.domain

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.root.domain.model.ActorDomainModel

class PagerSourceActors(private val repository: ActorsRepository) :
    PagingSource<Int, ActorDomainModel>() {

    override fun getRefreshKey(state: PagingState<Int, ActorDomainModel>): Int {
        return FIRST_PAGE
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ActorDomainModel> {

        val page = params.key ?: FIRST_PAGE

        return runCatching { repository.getActors(page) }.fold(
            onSuccess = { actors ->
                LoadResult.Page(
                    prevKey = if (page == 1) null else page - 1,
                    data = actors,
                    nextKey = if (actors.isEmpty()) null else page + 1
                )
            },
            onFailure = { LoadResult.Error(it) }
        )
    }


    private companion object {
        const val FIRST_PAGE = 1
    }
}