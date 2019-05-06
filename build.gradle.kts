import org.gradle.api.tasks.wrapper.Wrapper.DistributionType

tasks {
	getByName<Wrapper>("wrapper") {
		gradleVersion = "5.4.1"
		distributionType = DistributionType.ALL
	}
}
