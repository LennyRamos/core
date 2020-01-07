package udemy.datastructuresandalgorithms.basics.recursion

/**
 * Example if number == 5
 *
 * first go in check if number == 0
 *
 * then return (5 * factorial(5 - 1))
 *
 * now in the factorial(5 - 1)
 *
 * check if its == 0
 *
 * then return ( 4 * factorial(4 - 1))
 *
 * ...
 *
 * etc.
 *
 * until final output number == 0
 *
 * which then everything pops off and becomes
 *
 * 5 * 4 * 3 * 2 * 1 * 1 = 120
 */
object RecursionFactorial {

    fun factorial(number: Int): Int {

        if (number == 0) {
            return 1
        }

        return (number * factorial(number - 1))
    }
}