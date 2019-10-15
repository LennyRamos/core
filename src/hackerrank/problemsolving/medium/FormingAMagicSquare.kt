package hackerrank.problemsolving.medium

import java.util.*


/**
 * We define a magic square to be an NxN matrix of distinct positive integers
 * from to where the sum of any row, column, or diagonal of length is always
 * equal to the same number: the magic constant.
 *
 * You will be given a 3x3 matrix s of integers in the inclusive range [1,9].
 * We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|.
 * Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
 */
class FormingAMagicSquare {

    //The row, column and diagonal sums
    // 0 - row 1    | 3 - column 1  | 6 - diag 1
    // 1 - row 2    | 4 - column 2  | 7 - diag 2
    // 2 - row 3    | 5 - column 3
    private var sumArray = Array(8) { 0 }

    // The numbers needed in each sum to be a magic sum
    // values same as above
    private var neededForMagicSquare = Array(8) { 0 }

    // make magic square
    private fun formingMagicSquare(s: Array<Array<Int>>): Int {


        return 0
    }

    /**
     * O((1/3)n) == O(n)
     */
    private fun checkSums(arr: Array<Array<Int>>) {

        val sizeOfDoubleMatrix: Int = arr.size - 1

        for (x in 0..sizeOfDoubleMatrix) {
            //rows
            sumArray[0] += arr[x][0]
            sumArray[1] += arr[x][1]
            sumArray[2] += arr[x][2]
            //columns
            sumArray[3] += arr[0][x]
            sumArray[4] += arr[1][x]
            sumArray[5] += arr[2][x]
            //diags
            sumArray[6] += arr[x][x]
            sumArray[7] += arr[x][(sizeOfDoubleMatrix) - x]
        }
        println("These are the values of the matrix for magic square ")

        for (y in 0 until sumArray.size) {
            println("$y :: " + sumArray[y])
        }

    }

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