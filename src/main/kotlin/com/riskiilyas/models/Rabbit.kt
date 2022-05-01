package com.riskiilyas

@kotlinx.serialization.Serializable
data class Rabbit(
    val id: Int,
    val name: String,
    val desc: String,
    val url: String
)
