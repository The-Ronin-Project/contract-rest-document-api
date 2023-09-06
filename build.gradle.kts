group = "com.projectronin.rest.contract"

// node {
//     download.set(true)
//     version.set("20.5.1")
// }

plugins {
    alias(roningradle.plugins.buildconventions.kotlin.jvm)
    alias(roningradle.plugins.openapi.contract)
}

dependencies {
    openapi("com.projectronin.rest.contract:ronin-contract-shared-v1:1.0.0")
}
