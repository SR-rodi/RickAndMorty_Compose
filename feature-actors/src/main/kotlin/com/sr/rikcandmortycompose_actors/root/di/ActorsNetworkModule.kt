package com.sr.rikcandmortycompose_actors.root.di

import com.sr.rikcandmortycompose_actors.actors.presentation.viewmodel.ActorsViewModel
import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.mapper.ActorMapper
import com.sr.rikcandmortycompose_actors.root.data.repository.ActorsRepositoryImpl
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

fun actorsNetworkModule() = module {

    single<ActorsApi> { get<Retrofit>().create() }

    singleOf(::ActorMapper)
    singleOf(::ActorsRepositoryImpl) { bind<ActorsRepository>() }

    viewModelOf(::ActorsViewModel)
}
