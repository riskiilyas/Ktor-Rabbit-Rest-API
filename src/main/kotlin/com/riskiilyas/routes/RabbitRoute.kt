package com.riskiilyas.routes

import com.riskiilyas.models.Rabbit
import com.riskiilyas.models.RabbitBreeds
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.rabbit() {
    get("/randomRabbit") {
        call.respond(
            HttpStatusCode.OK,
            Rabbit.getRandomRabbit()
        )
    }

    get("/randomRabbitBreed") {
        call.respond(
            HttpStatusCode.OK,
            RabbitBreeds.randomRabbitBreeds()
        )
    }
}