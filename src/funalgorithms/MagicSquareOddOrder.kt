package funalgorithms

import java.util.*

/**
 * For a given odd value of N
 * Build a magic square of size NxN where each number in the
 * matrix will be a unique value from 1...(N^2)
 *
 * Algorithm is as follows
 *
 * start in the middle column of the first row and inset 1
 * then move up and to the right one
 * if a value is in that cell move down and insert there
 *
 * When an "up and to the right" move would leave the square,
 * it is wrapped around to the last row or first column, respectively.
 */
class MagicSquareOddOrder {

    /**
     * The NxN matrix
     */
    private lateinit var oddOrder: Array<Array<Int>>

    /**
     * Populates the oddOrderMatrix with the appropriate values
     */
    private fun createMagicSquareOfOddOrder() {

    }

    /**
     * Initialized the matrix
     */
    private fun initializeMatrix(i: Int) {
        oddOrder = Array(i) { Array(i) { 0 } }
    }

    /**
     * Prints out the magic matrix
     */
    private fun printOutMagicMatrix() {
        for (arr: Array<Int> in oddOrder) {
            for (i: Int in arr) {
                print("$i, ")
            }
            println()
        }
    }

    /**
     * main method
     */
    fun run() {
        val scan = Scanner(System.`in`)

        println("Will create a magic square of Odd Order")
        println("Please enter an odd value N fof NxN matrix and press enter")
        val n = scan.nextLine().toInt()

        initializeMatrix(n)
        createMagicSquareOfOddOrder()

        println()
    }
}