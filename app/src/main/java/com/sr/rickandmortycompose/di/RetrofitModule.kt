package com.sr.rickandmortycompose.di

import com.sr.rickandmortycompose.BASE_URL
import com.sr.rikcandmortycompose_actors.root.data.api.ActorsApi
import com.sr.rikcandmortycompose_actors.root.data.repository.ActorsRepositoryImpl
import com.sr.rikcandmortycompose_actors.root.domain.ActorsRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

fun retrofitModule()  = module{

    single { Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    }

}