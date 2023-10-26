group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    arrayOf("SUSPEND_MODIFIER", "AUTHENTICATION").forEach {
        controllerOptions.add(it)
    }
}

dependencies {
    openapi("com.projectronin.rest.contract:ronin-contract-shared-v1:1.0.0")
    implementation(ronincommon.spring.security.core)
}
