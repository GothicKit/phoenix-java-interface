import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "de.lmichaelis"
version = "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
    implementation("net.java.dev.jna:jna:5.13.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes("Main-Class" to "de.lmichaelis.phoenix.Test")
    }
}

tasks.withType<ShadowJar> {
    archiveBaseName.set("phoenix")
    archiveClassifier.set("")
    archiveVersion.set("0.0.1")
}