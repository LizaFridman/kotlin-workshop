package day1.lecture1.exercises

/**
 * Create a nullable integer variable
 *
 * Use a null-check that increases the value by one if it's not null,
 * otherwise returns 0, and prints the result.
 *
 */
fun main() {
    // Write your code below this line
    var nullableInt: Int? = null;
    println("Pre-Change: $nullableInt");

    nullableInt = nullableInt?.plus(1) ?: 0;
    println(nullableInt);
}