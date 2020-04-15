package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import ru.rit.pkt.product_inventory.config.DbContainerInitializer

@SpringBootTest
@ContextConfiguration(initializers = [DbContainerInitializer::class])
class DemoApplicationTests {

    @Test
    fun contextLoads() {
    }

}
