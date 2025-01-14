package day1.lecture2.exercises

/**
 * Create a when statement with three comparisons:
 *
 * Create a string variable with your name
 *
 * If the length of your name is 0, print an error message.
 * If the length is longer than 2, but shorter than 12, print your name and the length.
 * If it's anything else, print "OK name".
 *
 */
fun main() {
    //Write your code below this line
    var name: String = "My Name"
    println("Name is \"$name\"")

    when{
        name.isEmpty() -> println("Error! Name length is 0")
        (name.length in 3..11) -> println("Name = $name Length = ${name.length}")
        else -> println("OK name")
    }
}