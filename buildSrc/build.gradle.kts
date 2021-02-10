plugins {
    `java-gradle-plugin`
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("testPlugin") {
            id = "org.khomenko.test.plugin"
            implementationClass = "org.khomenko.test.plugin.TestPlugin"
        }
    }
}