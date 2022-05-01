package com.riskiilyas.plugins

import com.riskiilyas.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

const val BASE_URL = "http://192.168.56.1:8080"

val rabbits = listOf(
    Rabbit(1, "Bambi", "Bambi Character", "$BASE_URL/rabbits/bambi.png"),
    Rabbit(2, "Looney Toons", "Looney Toons Character", "$BASE_URL/rabbits/looney_toons.png"),
    Rabbit(3, "Max & Ruby", "Max & Ruby Character", "$BASE_URL/rabbits/maxnruby.png"),
    Rabbit(4, "Rabbit Invasion", "Rabbit Invasion Character", "$BASE_URL/rabbits/rabbit_invasio.png"),
    Rabbit(5, "Zootopia", "Zootopia Character", "$BASE_URL/rabbits/zootopia.png")
    )

fun Route.randomRabit() {
    get("/randomRabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}