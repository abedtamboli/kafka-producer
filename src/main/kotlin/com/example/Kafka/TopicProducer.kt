package com.example.Kafka

import com.example.Kafka.POJO.User
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service


@Service
class TopicProducer(val kafkaTemplate: KafkaTemplate<String, String>) {

    @Value("\${topic.name.producer}")
    lateinit var topicName: String;

    fun send(message: String) {
        println(message)
        kafkaTemplate.send(topicName, message)
    }
}