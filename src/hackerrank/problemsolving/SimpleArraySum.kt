package hackerrank.problemsolving

import java.util.*

/**
 * @author Lenny Ramos
 *
 * Simple Array Sum solution
 *
 * Problem :
 *      Given an array of integers, find the sum of its elements.
 * Input Format:
 *      The first line contains an integer, n , denoting the size of the array.
 *      The second line contains n space-separated integers representing the array's elements.
 */
class SimpleArraySum {

    /*
     * Adds all the numbers in the
     */
    private fun simpleArraySum(ar: Array<Int>): Int {
        var temp = 0
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
        val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val bool = ar.any { it > 1000 }
        if (bool) {
            println("Numbers to be added must be less than 1000")
            return;
        }

        val result = simpleArraySum(ar)

        println(result)
    }

}