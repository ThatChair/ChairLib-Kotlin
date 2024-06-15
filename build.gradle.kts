plugins {
    kotlin("jvm") version "1.9.23"
}

group = "org.chairlib"
version = "0.0.1a"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}