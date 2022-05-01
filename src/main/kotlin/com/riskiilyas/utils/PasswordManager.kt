package com.riskiilyas.utils

fun String.encrypt(): String {
    val strBuilder = StringBuilder()
    this.forEach {
        strBuilder.append("${it.code*7-3},")
    }
    return strBuilder.toString()
}

fun String.decrypt(): String {
    val strBuilder = StringBuilder()
    split(',').forEach {
        strBuilder.append(((it.toInt()+3)/7).toChar())
    }
    return strBuilder.toString()
}