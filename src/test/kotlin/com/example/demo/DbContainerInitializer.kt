package ru.rit.pkt.product_inventory.config

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext
import org.testcontainers.containers.PostgreSQLContainer

@TestConfiguration
class DbContainerInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {

    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        val postgres = KPostgreSQLContainer("postgres:9.6")
                .withDatabaseName("test")
                .withUsername("postgres")
                .withPassword("postgres")
        postgres.start()
        Thread.sleep(30000)
    }
}

class KPostgreSQLContainer(imageName: String) : PostgreSQLContainer<KPostgreSQLContainer>(imageName)