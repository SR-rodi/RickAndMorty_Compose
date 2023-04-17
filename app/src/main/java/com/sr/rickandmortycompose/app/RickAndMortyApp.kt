package com.sr.rickandmortycompose.app

import android.app.Application
import com.sr.rickandmortycompose.di.appModule
import com.sr.rikcandmortycompose_actors.root.di.actorsNetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RickAndMortyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@RickAndMortyApp)
            modules(appModule())
        }
    }
}