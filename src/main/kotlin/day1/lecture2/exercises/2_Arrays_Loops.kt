package day1.lecture2.exercises

import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Create an integer array of numbers called "numbers" with 6 cells, that each cell contains the index number multiply 10.
 *
 * Create an empty mutable list for Strings.
 *
 * Write a for loop that loops over the array and adds the string representation of each number to the list.
 *
 */

fun main() {
    //Write your code below this line
    var numbers = IntArray(6){i -> i*10}
    var list = mutableListOf<String>()

    for(num in numbers){
        list.add(num.toString())
    }
    //uncomment the next line when you done "numbers" array
    println(numbers.toList())

    //uncomment the next line after you made the loop
    println(list)
}