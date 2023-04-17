package com.sr.rickandmortycompose.di

import com.sr.rikcandmortycompose_actors.root.di.actorsNetworkModule


fun appModule() = listOf(
    retrofitModule(),
    actorsNetworkModule()
)