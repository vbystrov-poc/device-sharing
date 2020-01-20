package com.github.udavpit.devicesharing.routes.handlers

import com.github.udavpit.devicesharing.domain.PhonoDeviceSpec
import com.github.udavpit.devicesharing.repositories.PhonoApiRepo
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import org.springframework.web.reactive.function.server.json
import reactor.core.publisher.Mono

/**
 * DeviceHandler
 *
 * @author Vladimir Bystrov
 */
@Component
class DeviceHandler(private val phonoApiRepo: PhonoApiRepo) {

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        val result = phonoApiRepo.getDevice("nexus")
        return ServerResponse.ok().json().body(result)
    }

    fun findOne(request: ServerRequest): Mono<ServerResponse> {
        val result = phonoApiRepo.getDevice("nexus").take(1)
        return ServerResponse.ok().json().body(result)
    }
}