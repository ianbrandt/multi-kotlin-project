import org.gradle.api.tasks.wrapper.Wrapper.DistributionType

plugins {
	kotlin("jvm") version "1.3.31" apply false
}

tasks {
	getByName<Wrapper>("wrapper") {
		gradleVersion = "5.4.1"
		distributionType = DistributionType.ALL
	}
}
