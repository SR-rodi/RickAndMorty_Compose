plugins {
    id(Plugins.android)
    id(Plugins.library)
}

android {
    compileSdk = Settings.targetSdk
    namespace = "com.sr.rickandmortycompose_core"
    defaultConfig {
        minSdk = Settings.minSdk
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Settings.composeCompiler
    }
}

dependencies {
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.composeActivity)

    implementation(Dependencies.Navigation.core)
    implementation(Dependencies.Navigation.compose)
    implementation ("androidx.paging:paging-compose:1.0.0-alpha18")

}