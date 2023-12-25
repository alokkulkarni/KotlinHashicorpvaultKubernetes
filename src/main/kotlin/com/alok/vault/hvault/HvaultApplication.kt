package com.alok.vault.hvault

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HvaultApplication(val secretsConfig: SecretsConfig) {

	companion object {
		val log: Logger = LoggerFactory.getLogger(HvaultApplication::class.java)
	}

	@Bean
	fun secretsFromVault(): CommandLineRunner = CommandLineRunner {
		log.info("Username: ${secretsConfig.username}")
		log.info("Password: ${secretsConfig.password}")
	}

}

fun main(args: Array<String>) {
	runApplication<HvaultApplication>(*args)
}
