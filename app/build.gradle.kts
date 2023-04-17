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
    implementation(project(Module.navigation))

    implementation(Dependencies.Accompanist.systemUiController)
    implementation(Dependencies.Core.coreKtx)
    implementation(Dependencies.Core.lifecycle)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.tooling)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.composeActivity)
    implementation(Dependencies.Navigation.core)
    implementation(Dependencies.Navigation.compose)
}