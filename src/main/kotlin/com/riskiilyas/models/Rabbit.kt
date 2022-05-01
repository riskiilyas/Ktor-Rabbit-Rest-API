package com.riskiilyas.models

import com.riskiilyas.BASE_URL

@kotlinx.serialization.Serializable
data class Rabbit(
    val id: Int,
    val name: String,
    val desc: String,
    val url: String
) {
    companion object {
        private val rabbits = listOf(
            Rabbit(1, "Bambi", "Bambi Character", "$BASE_URL/rabbits/bambi.png"),
            Rabbit(2, "Looney Toons", "Looney Toons Character", "$BASE_URL/rabbits/looney_toons.png"),
            Rabbit(3, "Max & Ruby", "Max & Ruby Character", "$BASE_URL/rabbits/maxnruby.png"),
            Rabbit(4, "Rabbit Invasion", "Rabbit Invasion Character", "$BASE_URL/rabbits/rabbit_invasio.png"),
            Rabbit(5, "Zootopia", "Zootopia Character", "$BASE_URL/rabbits/zootopia.png")
        )

        fun getRandomRabbit() = rabbits.random()
    }

}
