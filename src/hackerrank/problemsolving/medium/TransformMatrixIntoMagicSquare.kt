package hackerrank.problemsolving.medium

import funalgorithms.MagicSquareOddOrder
import java.util.*
import kotlin.math.abs


/**
 * We define a magic square to be an NxN matrix of distinct positive integers
 * from to where the sum of any row, column, or diagonal of length is always
 * equal to the same number: the magic constant.
 *
 * You will be given a 3x3 matrix s of integers in the inclusive range [1,9].
 * We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|.
 * Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
 *
 * Example Solution:
 *
 *   Matrix A       Matrix B (Magic Square)
 *        0   1   2      0   1   2
 *      -------------  -------------
 *  0   | 1 | 2 | 3 |  | 8 | 1 | 6 |
 *      -------------  -------------
 *  1   | 4 | 5 | 6 |  | 3 | 5 | 7 |
 *      -------------  -------------
 *  2   | 7 | 8 | 9 |  | 4 | 9 | 2 |
 *      -------------  -------------
 *
 * @since any magic square can be rotated and reflected to produce 8 trivially distinct squares.
 *
 * Rotate and reflect the magic square and iterate through each A[i][i] - B[i][i]
 * Get the Sum of each cost and then return the least of those cost.
 *
 * Solution @author Lenny Ramos
 */
class TransformMatrixIntoMagicSquare {

    //The row, column and diagonal sums
    // 0 - row 1    | 3 - column 1  | 6 - diag 1
    // 1 - row 2    | 4 - column 2  | 7 - diag 2
    // 2 - row 3    | 5 - column 3
    private var sumArray = Array(8) { 0 }

    /**
     * Different cost
     */
    private var magicSquareTransformCost = Array(8) { 0 }

    /**
     * An actual magic square of size
     */
    private lateinit var magicSquare: Array<Array<Int>>

    /**
     * the one dimension of the square
     */
    private var sizeOfMatrix: Int = 0

    /**
     * Transform into a magic square :)
     */
    private fun formingMagicSquare(s: Array<Array<Int>>): Int? {
        checkSums(s)
        generateMagicSquare()

        for (cost in magicSquareTransformCost.indices) {
            magicSquareTransformCost[cost] = checkCost(s)

            if (cost % 2 == 0) {
                rotateMatrixBy90Degrees(magicSquare)
            } else {
                reflectMatrix(magicSquare)
            }
        }

        return magicSquareTransformCost.min()
    }

    /**
     * O((1/3)n) == O(n)
     *
     * can make to check by double for loop if its
     * an unknown size matrix of NxN
     */
    private fun checkSums(arr: Array<Array<Int>>) {

        sizeOfMatrix = arr.size - 1

        for (x in 0..sizeOfMatrix) {
            //rows
            sumArray[0] += arr[0][x]
            sumArray[1] += arr[1][x]
            sumArray[2] += arr[2][x]
            //columns
            sumArray[3] += arr[x][0]
            sumArray[4] += arr[x][1]
            sumArray[5] += arr[x][2]
            //diags
            sumArray[6] += arr[x][x]
            sumArray[7] += arr[x][(sizeOfMatrix) - x]
        }
        printArray(sumArray, "These are the values of the matrix for magic square")
    }

    /**
     * This looks at what the values of neededForMagicSquare
     * and recalculates certain entries in the matrix to transform
     * it into a perfect square
     *
     * TODO add another param to check cost on any two matrices
     */
    private fun checkCost(inputMatrix: Array<Array<Int>>): Int {
        var cost = 0

        for (x in inputMatrix.indices) {
            for (y in inputMatrix.indices) {
                cost += abs(inputMatrix[x][y] - magicSquare[x][y])
            }
        }

        return cost
    }

    /**
     * stupid helper function to print array values
     */
    private fun printArray(arr: Array<Int>, s: String) {
        println(s)
        for (y in arr.indices) {
            println("$y :: " + arr[y])
        }
    }

    /**
     * Generates a matrix of size n-by-n to convert
     * non magic square into a magic square
     */
    private fun generateMagicSquare() {
        val magicSquareGenerator = MagicSquareOddOrder()
        magicSquare = magicSquareGenerator.createMagicSquare(sizeOfMatrix)
    }

    /**
     * Rotates Magic square
     */
    private fun rotateMatrixBy90Degrees(matrix: Array<Array<Int>>) {
        var temp: Int

        for (x in matrix.indices) {
            for (y in matrix.indices) {
                temp = matrix[x][y]

            }
        }

    }

    /**
     * Reflects Magic square
     */
    private fun reflectMatrix(matrix: Array<Array<Int>>) {

    }

    /**
     * Main function
     */
    fun run(args: Array<String>) {
        val scan = Scanner(System.`in`)

        val s = Array(3) { Array(3) { 0 } }

        for (i in 0 until 3) {
            s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        }

        val result = formingMagicSquare(s)

        println(result)
    }

}