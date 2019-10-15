package day1.lecture2.exercises

import kotlin.random.Random

/**
 * Create two ranges
 *      numbers between 1 - 20
 *      letters between 'a' - 'q'
 *
 * Check if a number lies within a range.
 * Check if a letter lies within a range.
 *
 * Iterate over the ranges you created earlier and print the results
 *      extra: with jumps of 2
 *      extra: backwards
 */
fun main() {
    //Write your code below this line

    //Create the ranges below this line
    var numbers = 1..20;
    var letters = 'a'..'q';

    //Use the ranges with an if statement below this line
    val number = Random.nextInt(until = 128);
    println("Random number = $number");
    if(number in numbers){
        println("$number is in $numbers");
    }

    val letter: Char = number.toChar()
    println("Random letter = $letter");
    if(letter in letters){
        println("$letter is in $letters");
    }

    //Iterate over the ranges below this line
    for(number in numbers step 2){
        print("$number ")
    }
println();
    for(letter in 'q' downTo 'a' step 2){
        print("$letter ")
    }
}