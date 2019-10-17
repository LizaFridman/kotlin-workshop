package day2.lecture4.exercises

import kotlin.random.Random

/**
 * It can be useful to know the weight of a book, for example, for shipping.
 * The weight of a book can change because sometimes pages get torn, and the page count changes.
 * While calculating the weight could be defined as a method, it’s more like a helper function.
 * Besides, it would hurt a book's feelings to have a method that tears up its pages.
 *
 *
 * 1. Add a mutable property [pages] to [Book].
 * 2. Create an extension function on [Book] that returns the weight of a book as the page count multiplied by 1.5 grams.
 * 3. Create another extension, [tornPages], that takes the number of torn pages as an argument and changes the page count of the book.
 * 4. Write a class [Puppy] with a method [playWithBook] that takes a book as an argument, and removes a random number of pages from the book.
 * 5. Create a puppy and give it a book to play with, until there are no more pages.
 *
 * Note: If you don’t want to give your puppy a book, then create a puzzle toy class and fill it with treats.
 */
fun main() {
    //Write your code below this line
    val puppy = Puppy()
    var book = Book(author = "Me", title = "It", pages = 100, year = 1999)

    var numOfIteration = 0
    while (book.pages > 0) {
        println("Round ${numOfIteration++}")
        println("Pages Left = ${book.pages}")
        puppy.playWithBook(book)
        println("Pages Left = ${book.pages}")
    }
}

fun Book.weight() : Double {
    return this.pages * 1.5
}

fun Book.tornPages(tornPages: Int): Unit{
    this.pages= this.pages - tornPages
}

class Puppy(){
    fun playWithBook(book: Book){
        val pagesToTear = Random.nextInt(book.pages)
        book.tornPages(pagesToTear)
    }
}