plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.mider"
version = "0.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

sourceSets {
    val main by getting {
        java {
            srcDirs("src/main/gen")
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.antlr:antlr4:4.13.1")
    implementation("com.github.whiterasbk:mider:beta0.9.19")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}