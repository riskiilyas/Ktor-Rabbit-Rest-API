package com.riskiilyas.db

import com.riskiilyas.entites.UserEntity
import com.riskiilyas.utils.encrypt
import org.ktorm.database.Database
import org.ktorm.dsl.from
import org.ktorm.dsl.insert
import org.ktorm.dsl.select
import java.time.Instant

var database: Database? = null

object UserTable{
    fun insertUser(
        username: String,
        gender: String,
        password: String,
        age: Int,
        fullname: String
    ) {
        database?.let {
            it.insert(UserEntity) {
                set(it.username, username)
                set(it.gender, gender)
                set(it.password, password.encrypt())
                set(it.age, age)
                set(it.full_name, fullname)
                set(it.created_at, Instant.now())
            }
        }
    }

    fun selectUser(username: String, password: String) {
        database?.let {
            it.from(UserEntity).select()
        }
    }

    fun updateUser(){

    }

    fun deleteUser() {

    }
}