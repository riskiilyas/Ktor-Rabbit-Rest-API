package com.riskiilyas.routes

import com.riskiilyas.models.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.randomRabit() {
    get("/randomRabbit") {
        call.respond(
            HttpStatusCode.OK,
            Rabbit.getRandomRabbit()
        )
    }

    get("/rabbitsType") {
        call.respond(
            HttpStatusCode.OK,

        )
    }
}