plugins {
    id(Plugins.android)
    id(Plugins.library)
}

android {
    compileSdk = Settings.targetSdk
    namespace = "com.sr.rickandmortycompose_actors"
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

    implementation(project(Module.core))
    implementation(project(Module.coreUi))

    implementation(Dependencies.Navigation.core)
    implementation(Dependencies.Navigation.compose)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.composeActivity)
    implementation(Dependencies.DI.core)
    implementation(Dependencies.DI.compose)
    implementation(Dependencies.DI.android)

    implementation ("androidx.paging:paging-compose:1.0.0-alpha18")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
}