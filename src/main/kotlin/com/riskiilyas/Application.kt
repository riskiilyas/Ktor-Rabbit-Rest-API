package com.riskiilyas

import com.riskiilyas.db.database
import com.riskiilyas.entites.UserEntity
import io.ktor.server.application.*
import com.riskiilyas.plugins.*
import com.riskiilyas.routes.configureRouting
import org.ktorm.database.Database
import org.ktorm.dsl.from
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

    database = Database.connect(
        url = "jdbc:mysql://localhost:3333/rabbit",
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root"
    )

    database!!.insert(UserEntity) {
        set(it.username, "budiman")
        set(it.gender, "Male")
        set(it.password, "123456")
        set(it.age, 33)
        set(it.full_name, "budiman sujatmiko")
        set(it.created_at, Instant.now())
    }
}