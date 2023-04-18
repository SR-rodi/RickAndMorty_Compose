plugins {
    id(Plugins.android)
    id(Plugins.library)
}

android {
    compileSdk = Settings.targetSdk
    namespace = "com.example.rickandmortycompose_core_ui"
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
    implementation("io.coil-kt:coil-compose:2.2.2")
}