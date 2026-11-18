plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.muhibiscr1t1kal.panvkdriverplugin"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.muhibiscr1t1kal.panvkdriverplugin"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
        configureEach {
            resValue("string","app_name","PanVK Driver Plugin")
            applicationIdSuffix = ".panvkdriverplugin"
            manifestPlaceholders["driver"] = "panvk"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
}
