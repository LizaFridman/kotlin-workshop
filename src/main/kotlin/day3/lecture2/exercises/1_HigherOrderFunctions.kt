package day3.lecture2.exercises

/**
 * Create a function named `filter`.
 * Change the function so that it will:
 *
 * @receiver Extension function on [MutableList] of type [E]
 * @param filter: Lambda function that has a parameter of type [E] and it should return [Boolean]

 * @return A filtered list based on the [filter] lambda
 */

fun <E> MutableList<E>.filterA(filter: (E) -> Boolean): MutableList<E>{
    return this.filter(filter).toMutableList()
}

fun main(){
    var list = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    println(list.filterA(::filterFunc))
}

fun filterFunc(element: Int): Boolean{
    return element%2 == 0
}