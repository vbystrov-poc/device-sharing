package com.github.udavpit.devicesharing.repositories

import com.github.udavpit.devicesharing.domain.PhonoDeviceQuery
import com.github.udavpit.devicesharing.domain.PhonoDeviceSpec
import com.github.udavpit.devicesharing.props.PhonoApiProps
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.body
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

/**
 * PhonoApiRepo
 *
 * @author Vladimir Bystrov
 */
@Component
class PhonoApiRepo(private val webClient: WebClient, private val props: PhonoApiProps) {

    fun getDevice(deviceName: String): Flux<PhonoDeviceSpec> {
        val reqBody = Mono.just(PhonoDeviceQuery(props.token, deviceName))
        val result = webClient.post()
                .uri("${props.url}/getdevice")
                .body(reqBody)
                .retrieve()
                .bodyToFlux(PhonoDeviceSpec::class.java)

        return result.take(10)
    }

    fun getLatest(deviceName: String): Mono<PhonoDeviceSpec> {
        //
    }
}