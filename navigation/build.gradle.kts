plugins {
    id(Plugins.android)
    id(Plugins.library)
}

android {
    compileSdk = Settings.targetSdk
    namespace = "com.sr.rickandmortycompose_navigation"
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
    implementation(project(Module.feature_actors))

    implementation(Dependencies.Navigation.core)
    implementation(Dependencies.Navigation.compose)

    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.composeActivity)
}