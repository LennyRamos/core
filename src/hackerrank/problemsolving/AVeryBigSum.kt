package hackerrank.problemsolving

import java.util.*
import kotlin.math.pow

/**
 * @author Lenny Ramos
 *
 * A Very Bid Array Sum solution
 *
 * Problem :
 *      Given an array of integers, find the sum of its elements.
 * Input Format:
 *      The first line contains an integer, n , denoting the size of the array.
 *      The second line contains n space-separated integers representing the array's elements.
 *
 * Constraint :
 *      1 <= n <= 10
 *      0 <= ar[i] <= 10^10
 */
class AVeryBigSum {

    /*
    * Adds all the numbers in the
    */
    private fun aVeryBigSum(ar: Array<Long>): Long {
        var temp = 0L
        for (i in ar) {
            temp += i
        }

        return temp
    }

    fun run(args: Array<String>) {
        val scan = Scanner(System.`in`)

        println("Enter the number of items to add")
        val arCount = scan.nextLine().trim().toInt()

        if (arCount <= 0) {
            println("must be larger than 0")
            return
        }

        println("Enter numbers to add with space in between")
        val ar = scan.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
        var limit = 10.0;
        limit = limit.pow(10);

        val bool = ar.any { it > limit }

        if (bool) {
            println("Numbers to be added must be less than 1000")
            return;
        }

        val result = aVeryBigSum(ar)

        println(result)
    }

}