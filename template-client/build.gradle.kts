plugins {
   kotlin("jvm")
}

dependencies {
   api(project(":template-domain"))
   implementation(libs.bundles.ktor.client)
   implementation(libs.bundles.logging)
}
