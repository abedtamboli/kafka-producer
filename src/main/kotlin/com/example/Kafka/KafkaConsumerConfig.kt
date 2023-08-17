import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.support.serializer.JsonDeserializer

//@Configuration
//@EnableKafka
class KafkaConsumerConfig {
    /*@Value("\${spring.kafka.bootstrap-servers}")
    private val bootstrapServers: String = ""

    @Bean
    fun kafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, KafkaMessage> {
        val factory = ConcurrentKafkaListenerContainerFactory<String, KafkaMessage>()
        factory.consumerFactory = consumerFactory()
        return factory
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<String, KafkaMessage> {
        val props = mapOf(
            ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG to bootstrapServers,
            ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG to StringDeserializer::class.java,
            ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG to JsonDeserializer::class.java
        )
        return DefaultKafkaConsumerFactory(props, StringDeserializer(), JsonDeserializer(KafkaMessage::class.java))
    }*/
}
