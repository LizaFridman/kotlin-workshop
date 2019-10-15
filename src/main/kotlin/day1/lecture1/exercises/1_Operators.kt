package day1.lecture1.exercises

/**
 *
 * 1. Print the sum of two Integers of your choice.
 *
 * 2. Print the subtraction of two numbers without using '-'.
 *
 * 3. Print the division of two numbers without using '/' and the result should be Double
 *
 */

fun main() {
    //Write your code here
    var integer1 = 14;
    var integer2 = 8
    println("Number 1: $integer1");
    println("Number 2: $integer2");
    //1
    println("Sum: $integer1 + $integer2 =  ${integer1.plus(integer2)}");

    //2
    println("Subtraction: $integer1 - $integer2 = ${integer1.minus(integer2)}");

    //3
    println("Division: $integer1/$integer2 = ${integer1.div(integer2)}");
}