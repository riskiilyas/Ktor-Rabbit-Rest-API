package com.riskiilyas.db

import org.ktorm.database.Database

var database: Database? = null

fun checkDatabase() {
    if (database == null) {
        database = Database.connect(
            url = "jdbc:mysql://localhost:3333/rabbit",
            driver = "com.mysql.cj.jdbc.Driver",
            user = "root"
        )
    }
}