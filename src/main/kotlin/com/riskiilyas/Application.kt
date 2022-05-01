package com.riskiilyas

import io.ktor.server.application.*
import com.riskiilyas.plugins.*
import com.riskiilyas.routes.configureRouting

const val BASE_URL = "http://192.168.56.1:8080"
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureMonitoring()
    configureSerialization()
}
