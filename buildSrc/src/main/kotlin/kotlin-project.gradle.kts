import org.gradle.api.JavaVersion.VERSION_1_8
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm")
}

repositories {
	jcenter()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}

tasks {
	withType<KotlinCompile> {
		kotlinOptions.jvmTarget = VERSION_1_8.toString()
	}
}
