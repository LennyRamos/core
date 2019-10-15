package hackerrank.problemsolving.easy

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
    private var sumArray = Array(8) { 0 }

    // The numbers needed in each sum to be a magic sum
    private var neededForMagicSquare = Array(8) { 0 }

    // make magic square
    private fun formingMagicSquare(s: Array<Array<Int>>): Int {


    }

    private fun checkSums(arr: Array<Array<Int>>) {

        for (innerArr: Array<Int> in arr) {
            
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