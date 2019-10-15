package day1.lecture3.exercises

/**
 * Create a filter that gets all the curries and sorts them by string length.
 *
 * Filter the list of spices to return all the spices that start with 'c' and end in 'e'.
 *
 * **Bonus**
 * Take the first three elements of the list and return the ones that start with 'c'.
 */

fun main() {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    println(spices);
    //create the filters here
    val filteredCurry = spices.filter { it.contains("curry") }.sortedBy { spice -> spice.length }
    println(filteredCurry)
    val filteredStartCEndO = spices.filter { it[0] == 'c' && it[it.lastIndex] == 'e' }
    println(filteredStartCEndO)

    println(spices.subList(0,3).filter{it[0] == 'c'})
}