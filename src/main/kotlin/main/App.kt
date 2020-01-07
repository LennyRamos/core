package main

import crackingthecodinginterview.arraysandstrings.IsUnique1_1
import hackerrank.interviewprep.warmupchallenges.JumpingOnClouds
import hackerrank.interviewprep.warmupchallenges.SockMerchant
import udemy.datastructuresandalgorithms.basics.recursion.RecursionExampleOne
import udemy.datastructuresandalgorithms.basics.recursion.RecursionFactorial
import udemy.datastructuresandalgorithms.basics.recursion.RecursionFibonacci

/**
 * @author Lenny Ramos
 *
 * Main to execute all of the Different Algorithms and problems
 *
 * Uncomment the set of code for now to run
 *
 * @todo clean this
 */
class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    // val searchAlgorithms = SearchAlgorithms()
    // searchAlgorithms.search(strategy = "BinarySearch", numToSearch = 130)

    // val simpleArraySum = SimpleArraySum();
    // simpleArraySum.run(args);

    // val aVeryLargeArraySum = AVeryBigSum();
    // aVeryLargeArraySum.run(args);

    // val diagonalDifference = DiagonalDifference();
    // diagonalDifference.run(args);

    // val formingAMagicSquare = TransformMatrixIntoMagicSquare();
    // formingAMagicSquare.run(args);

    //val magicSquareOddOrder = funalgorithms.MagicSquareOddOrder()
    // magicSquareOddOrder.run()

    // val sockMerchant: SockMerchant = SockMerchant()
    // sockMerchant.run()

    //val jumpingOnClouds = JumpingOnClouds()
    //jumpingOnClouds.run()

    //RecursionExampleOne.foo(3)

    // val factorial = 10
    // println("This is the factorial of $factorial " + RecursionFactorial.factorial(factorial))
    // println("This is the fibonacci number at the $factorial place " + RecursionFibonacci.fib(factorial))

    val isUnique = IsUnique1_1()
    isUnique.execute()
}