package com.github.udavpit.devicesharing.domain

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Device specification type definition
 */
data class PhonoDeviceSpec(

        @JsonProperty("DeviceName")
        val deviceName: String?,

        @JsonProperty("Brand")
        val brand: String?,

        val technology: String?,

        @JsonProperty("_2g_bands")
        val bands2g: String?,

        @JsonProperty("_3g_bands")
        val bands3g: String?,

        @JsonProperty("_4g_bands")
        val bands4g: String?
)

/**
 * Request query type for PhonoApi service
 */
data class PhonoDeviceQuery(val token: String, val device: String)