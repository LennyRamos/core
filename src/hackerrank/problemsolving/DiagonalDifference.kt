package hackerrank.problemsolving

import kotlin.math.abs

/**
 * @author Lenny Ramos
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 * assume matrix input of n-by-n
 *
 * Constraints:
 *      -100 <= arr[a][b] <= 100
 */
class DiagonalDifference {


    private fun diagonalDifference(arr: Array<Array<Int>>): Int {
        var leftToRightDiagonal = 0
        var rightToLeftDiagonal = 0
        val sizOfMatrix = arr.size - 1

        for (x in 0..sizOfMatrix) {
            leftToRightDiagonal += arr[x][x]
            rightToLeftDiagonal += arr[x][(sizOfMatrix) - x]
        }

        return abs(leftToRightDiagonal - rightToLeftDiagonal)
    }

    fun run(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val arr = Array(n) { Array(n) { 0 } }

        for (i in 0 until n) {
            arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        }

        val result = diagonalDifference(arr)

        println(result)
    }
}