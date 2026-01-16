plugins {
    kotlin("jvm") version "2.3.0"
    id("com.gradleup.shadow") version "9.3.1"
    id("app.ultradev.hytalegradle") version "1.4.3"
}

group = "app.ultradev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

hytale {
    allowOp.set(true)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(25)
}
