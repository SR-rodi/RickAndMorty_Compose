package com.sr.rikcandmortycompose_actors.root.di

import com.sr.rikcandmortycompose_actors.screen.actors.presentation.model.mapper.ActorMapperUiModel
import com.sr.rikcandmortycompose_actors.screen.actors.presentation.viewmodel.ActorsViewModel
import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.mapper.ActorMapperDomainModel
import com.sr.rikcandmortycompose_actors.root.data.repository.ActorsRepositoryImpl
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import com.sr.rikcandmortycompose_actors.screen.actors.domain.ActorsUseCaseImpl
import com.sr.rikcandmortycompose_actors.screen.actors.domain.ActorsUseCase
import com.sr.rikcandmortycompose_actors.screen.detail.data.ActorDetailUseCaseImpl
import com.sr.rikcandmortycompose_actors.screen.detail.domain.ActorDetailUseCase
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.model.mapper.ActorDetailMapperUiModel
import com.sr.rikcandmortycompose_actors.screen.detail.presentation.viewmodel.DetailActorViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

fun actorsNetworkModule() = module {

    single<ActorsApi> { get<Retrofit>().create() }

    singleOf(::ActorMapperDomainModel)
    singleOf(::ActorMapperUiModel)
    singleOf(::ActorDetailMapperUiModel)

    singleOf(::ActorsRepositoryImpl) { bind<ActorsRepository>() }

    singleOf(::ActorDetailUseCaseImpl) { bind<ActorDetailUseCase>() }
    singleOf(::ActorsUseCaseImpl) { bind<ActorsUseCase>() }

    viewModelOf(::ActorsViewModel)
    viewModelOf(::DetailActorViewModel)
}
