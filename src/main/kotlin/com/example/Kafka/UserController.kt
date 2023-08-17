package com.example.Kafka

import com.example.Kafka.POJO.User
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(val topicProducer: TopicProducer) {

    @GetMapping("/users")
    fun getUser(): User? {
        val user = User(1,"Nikhil Choudhary", "Indore")
        topicProducer.send(user.toString())
        return ResponseEntity.ok(user).body
    }

    @PostMapping("/users")
    fun postUser(@RequestBody() user:User): User? {

        val objectMapper = ObjectMapper()
        val jsonString = objectMapper.writeValueAsString(user)
        topicProducer.send(jsonString)
        return ResponseEntity.ok(user).body
    }


}