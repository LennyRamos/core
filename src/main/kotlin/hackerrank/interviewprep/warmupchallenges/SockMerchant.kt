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
        print("Hello world")
        val scan = Scanner(System.`in`)
        var n: Int = 0

        while (scan.hasNextLine()) {
            n = scan.nextLine().trim().toInt()
        }

        var arr: Array<Int> = arrayOf()

        while (scan.hasNextLine()){
            arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
        }


        val result: Int = getPairs(n, arr)

        println(result)
    }
}