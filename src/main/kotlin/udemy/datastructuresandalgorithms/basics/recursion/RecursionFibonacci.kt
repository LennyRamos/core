package udemy.datastructuresandalgorithms.basics.recursion

import java.lang.Exception

/**
 *
 */
object RecursionFibonacci {

    fun fib(number: Int): Int {
        if (number < 1) {
            throw Exception("Cannot find the fibonacci sequence of a number less than 1")
        }

        if (number == 1 || number == 2) {
            return number - 1
        }

        return fib(number - 1) + fib(number - 2)
    }
}