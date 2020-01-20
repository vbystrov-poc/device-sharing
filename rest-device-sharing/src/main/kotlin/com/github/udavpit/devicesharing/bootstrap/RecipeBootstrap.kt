package com.github.udavpit.devicesharing.bootstrap

import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional


/**
 * RecipeBootstrap
 *
 * @author Vladimir Bystrov
 */
@Component
class RecipeBootstrap : ApplicationListener<ContextRefreshedEvent> {

    private val logger = LoggerFactory.getLogger(RecipeBootstrap::class.java)

    @Transactional
    override fun onApplicationEvent(event: ContextRefreshedEvent) {
        logger.info("Loading Bootstrap Data")
    }
}