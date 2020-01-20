package com.github.udavpit.devicesharing.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

/**
 * PhonoApiConfig
 *
 * @author Vladimir Bystrov
 */
@Configuration
class PhonoApiConfig {

    @Bean
    fun webClient(): WebClient {
        return WebClient.create()
    }
}