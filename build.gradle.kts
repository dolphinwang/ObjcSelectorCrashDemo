buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:7.0.3")
    }
}

allprojects {
    repositories {
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        google()
        mavenCentral()
    }

    // This workaround leads to solve issue:https://youtrack.jetbrains.com/issue/KT-48807 for Xcode13
    tasks.withType(org.jetbrains.kotlin.gradle.tasks.CInteropProcess::class.java) {
        settings.compilerOpts("-DNS_FORMAT_ARGUMENT(A)=")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}