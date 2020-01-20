package com.github.udavpit.devicesharing

import com.github.udavpit.devicesharing.props.PhonoApiProps
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

/**
 * DeviceSharingApp
 *
 * @author Vladimir Bystrov
 */
@SpringBootApplication
@EnableConfigurationProperties(PhonoApiProps::class)
class DeviceSharingApp

fun main(args: Array<String>) {
    runApplication<DeviceSharingApp>(*args)
}