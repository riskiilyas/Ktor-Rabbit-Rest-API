package com.riskiilyas.db.entites

import com.riskiilyas.db.checkDatabase
import com.riskiilyas.db.database
import com.riskiilyas.utils.encrypt
import org.ktorm.dsl.Query
import org.ktorm.dsl.from
import org.ktorm.dsl.insert
import org.ktorm.dsl.select
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.timestamp
import org.ktorm.schema.varchar
import java.time.Instant

object UserEntity: Table<Nothing>("user"){
    val username = varchar("username").primaryKey()
    val gender = varchar("gender")
    val password = varchar("password")
    val full_name = varchar("full_name")
    val age = int("age")
    val created_at = timestamp("created_at")

    fun insertUser(
        username: String,
        gender: String,
        password: String,
        age: Int,
        full_name: String
    ) {
        checkDatabase()
        database!!.insert(UserEntity) {
            set(it.username, username)
            set(it.gender, gender)
            set(it.password, password.encrypt())
            set(it.age, age)
            set(it.full_name, full_name)
            set(it.created_at, Instant.now())
        }
    }

    fun selectUser(username: String, password: String): Query {
        checkDatabase()
        return database!!.from(UserEntity).select()
    }

    fun updateUser(){
        checkDatabase()
    }

    fun deleteUser() {
        checkDatabase()
    }
}