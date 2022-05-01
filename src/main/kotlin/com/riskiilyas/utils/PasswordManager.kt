package com.riskiilyas.utils

fun String.encrypt() {
    val strBuilder = StringBuilder()
    this.forEachIndexed { i, str ->
        strBuilder.append(str.code*7-3)
    }
    this.replaceRange(0, length-1, strBuilder.toString())
}

fun String.decrypt() {
    val strBuilder = StringBuilder()
    this.forEachIndexed { i, str ->
        strBuilder.append((str.code+3)/7)
    }
    this.replaceRange(0, length-1, strBuilder.toString())
}