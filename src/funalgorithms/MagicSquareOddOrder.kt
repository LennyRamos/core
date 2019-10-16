package funalgorithms

import java.util.*
import kotlin.math.roundToInt

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

        println(x)
        println(y)

        oddOrder[y][x] = 1

        for (nextNumber: Int in 2..number) {
            x = updateIndexX(x)
            y = updateIndexY(y)

            println("adding this number $nextNumber")
            println("value of cell about to add: " + oddOrder[x][y])

            if (oddOrder[x][y] != 0) {
                x = findFreeCell(x, y)
            }

            oddOrder[x][y] = nextNumber
        }
    }

    /**
     * Takes care of the logic for up one
     */
    private fun updateIndexX(x: Int): Int {
        if (x == 0) {
            return lastIndexOfArr
        }
        return (x - 1)
    }

    /**
     * Takes care of the logic for to the right one
     */
    private fun updateIndexY(y: Int): Int {
        if (y == lastIndexOfArr) {
            return 0;
        }
        return (y + 1)
    }

    /**
     * @return the x value where there is a free spot
     */
    private fun findFreeCell(x: Int, y: Int): Int {
        var temp = x
        while (oddOrder[temp][y] != 0) {
            temp = updateIndexY(temp)
            //println(temp)
            //println("Getting stuck here $temp")
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

        println(number)
        println(lastIndexOfArr)
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

        println("Creating matrix")

        initializeMatrix(n)
        createMagicSquareOfOddOrder()

        printOutMagicMatrix()
    }
}