package main

import hackerrank.problemsolving.medium.TransformMatrixIntoMagicSquare

/**
 * @author Lenny Ramos
 *
 * Main to execute all of the Different Algorithms and problems
 *
 * Uncomment the set of code for now to run, will clean this
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

    val formingAMagicSquare = TransformMatrixIntoMagicSquare();
    formingAMagicSquare.run(args);

    // val magicSquareOddOrder = funalgorithms.MagicSquareOddOrder()
    // magicSquareOddOrder.run()

}
