package com.practice.kotlin

class Child : Parent(2) {
    companion object {
        init {
            println("child static init 1")
        }

        init {
            println("child static init 2")
        }

        init {
            println("child static init 3")
        }
    }

    init {
        println("child init 1")
    }

    init {
        println("child init 2")
    }

    init {
        println("child init 3")
    }
}

