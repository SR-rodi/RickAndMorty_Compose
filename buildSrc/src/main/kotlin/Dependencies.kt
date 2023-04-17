object Dependencies {
    object Core {
        val coreKtx = "androidx.core:core-ktx:${Versions.androidCore}"
        const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
    }

    object DI {
        const val core = "io.insert-koin:koin-core:${Versions.koin}"
        const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
        const val android = "io.insert-koin:koin-android:${Versions.koin}"
    }
    object Navigation {
        const val core = "io.github.alexgladkov:odyssey-core:${Versions.odyssey}"
        const val compose = "io.github.alexgladkov:odyssey-compose:${Versions.odyssey}"
    }

    object Accompanist {
        val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist}"
    }

    object Compose {
        const val utils = "androidx.compose.ui:ui-util:${Versions.compose}"
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val tooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
        const val material = "androidx.compose.material3:material3:${Versions.composeMaterial}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.activityCompose}"
    }
}