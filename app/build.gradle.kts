plugins {
    id(Plugins.application)
    id(Plugins.android)
}

android {
    namespace = "com.sr.rickandmortycompose"
    compileSdk = Settings.targetSdk

    defaultConfig {
        applicationId = applicationId
        minSdk = Settings.minSdk
        targetSdk = Settings.targetSdk
        versionCode = Settings.versionCode
        versionName = Settings.versionName

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            //            proguardFiles getDefaultProguardFile ('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Settings.kotlinJwm
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Settings.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(Module.coreUi))
    implementation(project(Module.core))
    implementation(project(Module.navigation))
    implementation(project(Module.feature_actors))

    implementation(Dependencies.Accompanist.systemUiController)
    implementation(Dependencies.DI.android)
    implementation(Dependencies.DI.compose)
    implementation(Dependencies.DI.core)
    implementation(Dependencies.Core.coreKtx)
    implementation(Dependencies.Core.lifecycle)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.composeActivity)
    implementation(Dependencies.Navigation.core)
    implementation(Dependencies.Navigation.compose)

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.google.code.gson:gson:2.10.1")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
}