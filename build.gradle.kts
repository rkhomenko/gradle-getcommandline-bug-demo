plugins {
    java
    id("org.springframework.boot") version "2.3.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

group = "org.khomenko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group ="org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
