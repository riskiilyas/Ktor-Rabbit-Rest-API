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
            call.respondText("Hello World!")
        }

        get("/creator") {
            call.respondText("Owner: Riski Ilyas")
        }

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
