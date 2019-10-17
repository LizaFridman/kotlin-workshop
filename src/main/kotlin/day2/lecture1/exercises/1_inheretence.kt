package day2.lecture1.exercises

/**
 * Create a class, Book, with a title and an author.
 * Add a method, readPage(), that increases the value of a private variable, currentPage, by 1.
 *
 * Create a subclass of Book; name it eBook.
 * eBook also takes in a format, which defaults to "text".
 * In eBooks, counting words makes more sense than pages.
 * Override the readPage() method to increase the word count by 250, (the average number of words per page from typewriter days).
 */

//Modify the code below this line

//class Book
open class Book(open val title: String, open val author: String){
    protected var currentPage = 0
    open fun readPage(){  currentPage++}
}

//class eBook
class eBook(override val title: String, override val author: String, val format: String = "Text"): Book(title, author){
    var wordCount = 0
    override fun readPage() {
        wordCount += 250
    }
}