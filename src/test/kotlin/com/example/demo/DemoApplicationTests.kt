package com.example.demo

import com.example.demo.repository.UnitRepository
import org.junit.Assert
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner
import ru.rit.pkt.product_inventory.config.DbContainerInitializer
import javax.transaction.Transactional

@SpringBootTest
@Transactional
@TestPropertySource(locations = ["classpath:application-test.properties"])
@ContextConfiguration(initializers = [DbContainerInitializer::class])
class DemoApplicationTests {

    @Autowired
    lateinit var unitRepository: UnitRepository


    @Test
    fun contextLoads() {
        val result = unitRepository.findAll();
        Assert.assertNotNull(result)
    }
}
