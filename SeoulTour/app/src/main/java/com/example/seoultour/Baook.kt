package com.example.seoultour

// data : 데이터 클래스 정의. 클래스 내에 toString() 메소드가 자동으로 재정의
data class Book(var title: String, var price: Int)
class MyBook {
    var title: String? = null
        set(value) {    // title property의 setter를 재정의
            field = value + "!!"
        }
        get() = "Book Title : " + field
    var price: Int = 0
}

// class inheritance
abstract class Shape(var color: String) {   // 추상클래스 : 객체를 생성할 수 없는 클래스
    abstract fun makeSize()
}
class Rectangle(var w: Int, var h: Int, color: String) : Shape(color) {
    var size: Int = 0
        get() = w * h
    override fun makeSize() {   // override 키워드가 있어야 부모의 함수를 재정의함
        size = w * h

    }
}

fun main() {
    val book = Book("harry", 21800)
    val book2 = Book("harry", 21800)
    val book3 = book // book 객체 주소를 book3에 복사
    println(book)

    // === 는 주소 비교
    val equal = book === book2
    println(equal)

    val mybook = MyBook()
    mybook.title = "Harry"  // mybook.setTitle("harry")
    println(mybook.title)   // myboo.getTitle()

    val rect = Rectangle(4, 5, "Red")
    println(rect.size)
}