plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}
afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("stageProgressBarRelease") {
                groupId = "io.github.AKSHAYKUMAR-SASI"
                artifactId = "StageProgressBar"
                version = "1.0.4"
            }
        }
    }
}

android {
    namespace = "com.akshay.stageprogress"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}