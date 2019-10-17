package day1.lecture4.exercises

/**
 *
 * Create class, SimpleSpice.
 *
 * Let the class be a property with a String for the name of the spice,
 * and a String for the level of spiciness.
 *
 * Set the name to "curry" and the spiciness to "mild".
 *
 * Using a string for spiciness is nice for users, but not useful for calculations.
 *
 * Add a heat property to your class with a getter that returns a numeric value for spiciness.
 * Use a value of 5 for mild.
 *
 * Add an init block that prints out its name and heat.
 *
 * Create an instance of SimpleSpice.
 *
 */
fun main() {
    SimpleSpice(name = "Bazil", spiciness = "not spicy")
    SimpleSpice()
    SimpleSpice(name = "Habanero", spiciness = "very spicy")
}

class SimpleSpice(val name: String = "curry", var spiciness: String = "mild") {
    var heat: Int = 5
        get() = when (spiciness) {
            "not spicy" -> 1
            "mild" -> 5
            "very spicy" -> 10
            else -> 0
        }

    init{
        println("Name: $name\nHeat: $heat")
    }

}