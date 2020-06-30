package com.practice.test

typealias myAlias = List<String>

fun main() {
    var dat: myAlias? = null
    println("kotlin")
    getCall(dat)
}

fun getCall(myAlias: myAlias?) {}

fun foo() {
    inlined { return }
}

inline fun inlined(block: () -> Unit) {
    println("hi!")
}