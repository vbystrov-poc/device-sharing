package com.github.udavpit.devicesharing.routes

import com.github.udavpit.devicesharing.routes.handlers.DeviceHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

/**
 * ApiRoutes
 *
 * @author Vladimir Bystrov
 */
@Configuration
class ApiRoutes(private val deviceHandler: DeviceHandler) {

    @Bean
    fun apiRouter() = router {
        (accept(MediaType.APPLICATION_JSON) and "/api").nest {
            "/devices".nest {
                GET("/", deviceHandler::findAll)
                GET("/{id}", deviceHandler::findOne)
            }
        }
    }
}