package com.example.lemonapp

fun main() {
    var data = arrayOf("Apple","Tomato","Lemon")
    var text = "Programming"

    for (a in 5 downTo 1 step 2) {   // min..max
        println(a * 2)
    }
    for (a in data) {
        println(a)
    }
    for (a in text) {
        println(a)
    }
}