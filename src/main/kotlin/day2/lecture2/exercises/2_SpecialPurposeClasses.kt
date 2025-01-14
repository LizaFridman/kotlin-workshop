package day2.lecture2.exercises


/**
 * Create a singleton class named "Counter" the class should have
 *
 *   1. private mutable variable [Int] named [counter] with a starting value of 0
 *   2. a single line function called [currentCount] which returns the value of [counter]
 *   3. a function called [increment] which adds 1 to the [counter] variable
 *
*/

//__________________Write your singleton here______________
object Counter{
    var counter: Int = 0

    fun currentCount(): Int = counter

    fun increment(): Int = counter++
}

/**
 * Create an enum class named "SolarSystem" the class needs to be filled with the following information
 *
 *
 * Mercury
 * Venus
 * Earth
 * Mars
 * Jupiter
 * Saturn
 * Uranus
 * Neptune
 *
 * EXTRA: add a radius parameter to the enum class and fill the stars with the radius
 *
 * Mercury = 2,439.7
 * Venus = 6,051.8
 * Earth = 6,371
 * Mars = 3,389.5
 * Jupiter = 69,911
 * Saturn = 58,232
 * Uranus = 25,362
 * Neptune = 24,622
 */

//__________________Write your enum class here______________
enum class SolarSystem(val radius: Double){
    Mercury(2439.7),
    Venus(651.8),
    Earth(6051.8),
    Mars(6051.8),
    Jupiter(6051.8),
    Saturn(6051.8),
    Uranus(6051.8),
    Neptune(6051.8)
}

/**
 * Write a sealed class named State
 * with four sub classes
 *
 * [Idle]
 * [Loading]
 * [Completed]
 * [Error]
 */

//__________________Write your sealed class here______________
sealed class State

class Idle: State()
class Loading: State()
class Completed: State()
class Error: State()
