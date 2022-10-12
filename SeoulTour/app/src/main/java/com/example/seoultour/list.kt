package com.example.seoultour

var fruit : List<String> = listOf("apple", "lemon", "cherry")  //Readonly List
var fruit2 : MutableList<String> = mutableListOf("apple", "lemon", "cherry") // 변경가능한 리스트
var map = mapOf<Int, String>(1 to "apple", 2 to "lemon")
fun main() {
    fruit += "berry"
    for(item in fruit)
        println(item)
    fruit -= "lemon"
    for(item in fruit) println(item)
    //fruit.set(0, "melon")   // 원소 변경 불가
    fruit2.set(0, "melon")  // 원소 변경 가능
    println("-----")
    for(item in map) println(item)
    for(key in map.keys) println(map.get(key))
}