package hackerrank.interviewprep.warmupchallenges

import java.util.*
import kotlin.collections.HashMap

/**
 * @author Lenny Ramos
 *
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
 */
class SockMerchant {

    /**
     * @param numberOfSocks the number of socks in the pile | 1 <= [numberOfSocks] <= 100
     * @param socks the colors of each sock | 1 <= [socks[i]] <= 100 where 0 <= i < numberOfSocks
     * @return total number of matching pairs of socks
     */
    private fun getPairs(numberOfSocks: Int, socks: Array<Int>): Int {

        var numberOfPairs: Int = 0

        // sock color to the number of it
        val sockMap: HashMap<Int, Int> = HashMap()

        for (sock: Int in socks) {
            if (!sockMap.containsKey(sock)) {
                sockMap[sock] = 0
            }

            if (sockMap.getValue(sock) <= 0) {
                sockMap.getValue(sock).plus(1)
            } else {
                sockMap.getValue(sock).minus(1)
                numberOfPairs++
            }

        }

        return numberOfPairs
    }

    /**
     * Main method
     */
    fun run() {
        val scan = Scanner(System.`in`)
        var number: Int = 0
        val arr: Array<Int>
        var userInput: String

        println("Please enter a number of socks")
        userInput = scan.nextLine()
        number = userInput.toInt()

        println("Please enter the sock color with a space in between")
        userInput = scan.nextLine()
        arr = userInput.split(" ").map { it.trim().toInt() }.toTypedArray()


        val result: Int = getPairs(number, arr)

        println("This many pairs $result")
    }
}