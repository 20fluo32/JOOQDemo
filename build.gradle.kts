import groovy.transform.builder.DefaultStrategy
import org.jetbrains.kotlin.gradle.targets.js.npm.importedPackageDir
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jooq.codegen.GenerationTool
import org.jooq.codegen.KotlinGenerator
import org.jooq.meta.jaxb.*


plugins {
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25"
    kotlin("plugin.lombok") version "2.0.21"
    id("io.freefair.lombok") version "8.10"
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.6"
//    id("nu.studer.jooq") version "4.2"
}

group = "com.luofan"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

buildscript {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        mavenCentral()
    }
    dependencies {
        classpath("org.jooq:jooq-codegen:3.19.15")
        classpath("mysql:mysql-connector-java:8.0.27")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.register("JOOQ_Code_Generate") {
    doLast {
        val config: org.jooq.meta.jaxb.Configuration = Configuration()
            .withJdbc(
                Jdbc()
                    .withDriver("com.mysql.cj.jdbc.Driver")
                    .withUrl("jdbc:mysql://192.168.117.128:3306/school?useSSL=false&characterEncoding=utf-8&serverTimezone=Asia/Shanghai&allowPublicKeyRetrieval=true")
                    .withUsername("root")
                    .withPassword("123456")
            )
            .withGenerator(
                Generator()
                    .withGenerate(
                        Generate()
                            .withPojos(true)
                            .withComments(true) // 注释 √
                            .withCommentsOnCatalogs(true)
                            .withRelations(true)
                            .withImmutablePojos(false) // if true, cannot use 'into()' method
                            .withInterfaces(true)
                            .withDaos(true)
                    )
                    .withDatabase(
                        Database()
                            .withName("org.jooq.meta.mysql.MySQLDatabase")
                            .withIncludes(".*")
                            .withExcludes("")
                            .withInputSchema("school")
                    )
                    .withTarget(
                        org.jooq.meta.jaxb.Target()
                            .withPackageName("com.jooq.data")
                            .withDirectory("D:/IDEA_WORK/demo2/src/main/kotlin")
                    )
            )
        GenerationTool.generate(config)
    }
}

// jooq配置代码
//jooq {
//    version = "3.19.15"
//    edition = nu.studer.gradle.jooq.JooqEdition.OSS
//    generateSchemaSourceOnCompilation = false
//
//}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    maven {
        setUrl("https://maven.aliyun.com/repository/public/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.projectlombok:lombok")
    runtimeOnly("mysql:mysql-connector-java:8.0.27")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.jooq:jooq:3.19.15")
    implementation("org.jooq:jooq-codegen:3.19.15")
    implementation("org.jooq:jooq-meta:3.19.15")
    implementation("com.xiaoleilu:hutool-core:3.3.2")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}


tasks.withType<Test> {
    useJUnitPlatform()
}
