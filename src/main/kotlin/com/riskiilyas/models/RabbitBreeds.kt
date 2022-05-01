package com.riskiilyas.models

import com.riskiilyas.BASE_URL

@kotlinx.serialization.Serializable
data class RabbitBreeds(
    val breed_name: String,
    val img_url: String,
    val avg_size: Float,
    val origin: String
) {
    companion object {
        private val rabbitBreeds = listOf(
            RabbitBreeds("Alaska", "$BASE_URL/rabbit_breeds/rabbit_alaska.jpg", 3.7f, "Europe"),
            RabbitBreeds("Chinchilla", "$BASE_URL/rabbit_breeds/Chinchilla.jpg", 3.2f, "France"),
            RabbitBreeds("Himalayan", "$BASE_URL/rabbit_breeds/Himalayan.jpg", 3.1f, "China"),
            RabbitBreeds("Tan", "$BASE_URL/rabbit_breeds/Tan.jpg", 2.3f, "England"),
            RabbitBreeds("Lionhead", "$BASE_URL/rabbit_breeds/Lionhead.jpg", 1.5f, "Belgium")
        )

        fun randomRabbitBreeds() = rabbitBreeds.random()
    }
}
