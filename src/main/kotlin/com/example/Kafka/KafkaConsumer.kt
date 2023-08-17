package com.example.Kafka

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaConsumer (val objectMapper : ObjectMapper) {
//    @KafkaListener(topics = ["quickstart-events"], groupId = "group-id")
//    fun consume(message: String) {
////        var user = objectMapper.readValue(message,User::class.java)
//        println("Received message:${message}")
//    }
}
