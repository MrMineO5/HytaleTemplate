plugins {
    id("java")
    id("com.gradleup.shadow") version "9.3.1"
    id("app.ultradev.hytalegradle") version "2.0.1"
}

group = "app.ultradev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}

hytale {
    allowOp.set(true)

    manifest {
        version.set(project.version.toString())
    }
}
