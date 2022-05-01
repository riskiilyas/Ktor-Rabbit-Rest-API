package com.riskiilyas.entites

import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.timestamp
import org.ktorm.schema.varchar

object UserEntity: Table<Nothing>("user"){
    val username = varchar("username").primaryKey()
    val gender = varchar("gender")
    val password = varchar("password")
    val full_name = varchar("full_name")
    val age = int("age")
    val created_at = timestamp("created_at")
}