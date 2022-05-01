package com.riskiilyas.routes

import com.riskiilyas.routes.randomRabit
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        randomRabit()

        get("/") {
            call.respondText("""
                Hi, Welcome to Rabbit REST API by Riski Ilyas!
                Here is the list of endpoints that provided by this API:
                1. Get Random Rabbit:       ' /randomRabbit '
                2. Get Random Rabbit Breed: ' /randomRabbitBreed '
            """.trimIndent())
        }

        get("/creator") {
            call.respondText("Created By: Riski Ilyas")
        }

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
