package com.riskiilyas

import com.riskiilyas.db.database
import com.riskiilyas.db.checkDatabase
import com.riskiilyas.db.entites.UserEntity
import io.ktor.server.application.*
import com.riskiilyas.plugins.*
import com.riskiilyas.routes.configureRouting
import org.ktorm.dsl.insert
import java.time.Instant

const val BASE_URL = "http://192.168.56.1:8080"
fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureRouting()
    configureMonitoring()
    configureSerialization()
    checkDatabase()
}