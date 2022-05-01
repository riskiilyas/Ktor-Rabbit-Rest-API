package com.riskiilyas.utils

fun String.encrypt(): String {
    val strBuilder = StringBuilder()
    this.forEachIndexed { i, str ->
        strBuilder.append(str.code*7-3)
    }
    return strBuilder.toString()
}

fun String.decrypt(): String {
    val strBuilder = StringBuilder()
    this.forEachIndexed { i, str ->
        strBuilder.append((str.code+3)/7)
    }
    return strBuilder.toString()
}