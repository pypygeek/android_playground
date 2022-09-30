package com.example.kotlinclass

import android.icu.text.CaseMap.Title

/*
class -> object
1. 이름
2. 속성 = 멤버변ㅅ = 상태
3. 메소드 = 함수 = 동작
 */

// 클래스 이름만 정의한 경우
// class Book

//class Book constructor(_title:String, _price:Int) {
//    var title: String? = null
//    var price: Int = 0
////    constructor(title: String, price:Int, discount:Int) : this(title, price) {
////        this.title = title  // 클래스 멤버변수 = 생성자 매게변수
////        this.price = price
////    }
//}

class Book(var title: String, var price: Int) {
    fun discount(rate: Int) {
        price = price - (price * rate / 100)
    }
}

fun main() {
    var book = Book("", 0) // Book 객체 생성
    book.title = "Database" // (Java Ver) book.setTitle("Database")
    book.price = 12300
    var book2 = Book("Java", 210000)
    book2.discount(15)
    println("${book2.title} : ${book2.price}")
}