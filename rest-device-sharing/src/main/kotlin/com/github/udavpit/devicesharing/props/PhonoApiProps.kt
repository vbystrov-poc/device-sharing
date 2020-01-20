package com.github.udavpit.devicesharing.props

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * PhonoApiProps
 *
 * @author Vladimir Bystrov
 */
@ConfigurationProperties("phonoapi")
class PhonoApiProps {

    lateinit var token: String
    lateinit var url: String
}