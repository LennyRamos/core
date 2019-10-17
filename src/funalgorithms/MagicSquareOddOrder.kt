package funalgorithms

import hackerrank.problemsolving.medium.FormingAMagicSquare
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
     * The value of N^2
     */
    private var number: Int = 0

    /**
     * The size of N
     */
    private var lastIndexOfArr: Int = 0

    /**
     * Populates the oddOrderMatrix with the appropriate values
     */
    private fun createMagicSquareOfOddOrder() {
        var x = ((lastIndexOfArr) / 2)
        var y = 0

        oddOrder[x][y] = 1
        println("adding this number 1 to cell [$x][$y]")

        var tempX: Int
        var tempY: Int

        for (nextNumber: Int in 2..number) {

            tempX = x
            tempY = y

            y = updateIndexY(y)
            x = updateIndexX(x)


            if (oddOrder[x][y] != 0) {
                y = tempY
                x = tempX

                y = findFreeCell(x, y)
            }

            println("adding this number $nextNumber to cell [$x][$y]")

            oddOrder[x][y] = nextNumber
        }
    }


    /**
     * Takes care of the logic for up one
     */
    private fun updateIndexY(number: Int): Int {
        if (number == 0) {
            return lastIndexOfArr
        }
        return (number - 1)
    }

    /**
     * Takes care of the logic for to the right one
     */
    private fun updateIndexX(number: Int): Int {
        if (number == lastIndexOfArr) {
            return 0
        }
        return (number + 1)
    }

    /**
     * @return the x value where there is a free spot
     */
    private fun findFreeCell(x: Int, y: Int): Int {
        var temp = y + 1
        while (oddOrder[x][temp] != 0) {
            temp = updateIndexX(y)
        }

        return temp
    }

    /**
     * Initialized the matrix
     */
    private fun initializeMatrix(i: Int) {
        oddOrder = Array(i) { Array(i) { 0 } }
        number = (i * i)
        lastIndexOfArr = i - 1
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
        val n = scan.nextLine().trim().toInt()

        initializeMatrix(n)
        createMagicSquareOfOddOrder()

        val formingAMagicSquare = FormingAMagicSquare()
        formingAMagicSquare.checkSums(oddOrder)

        printOutMagicMatrix()
    }
}