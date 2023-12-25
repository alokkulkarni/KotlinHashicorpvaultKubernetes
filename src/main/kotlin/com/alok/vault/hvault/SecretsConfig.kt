package com.alok.vault.hvault

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration


@Configuration
@ConfigurationProperties
data class SecretsConfig(
     var username: String,
     var password: String
) {
    constructor() : this("", "")
}