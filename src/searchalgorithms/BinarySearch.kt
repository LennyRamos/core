package searchalgorithms

import searchalgorithms.strategypattern.SearchSolution

/**
 * @author Lenny Ramos
 *
 * Linear Search Algorithm
 * @see <a href="https://www.geeksforgeeks.org/binary-search/">Binary Search</a>
 */

class BinarySearch() : SearchSolution() {

    override fun solve(arr: Array<Int>, i: Int): Int {
        array = arr
        numToSearchFor = i

        var middle: Int
        var beginning: Int = 0
        var end: Int = array!!.size - 1

        while (beginning <= end) {
            middle = beginning + (end - beginning) / 2

            if (array!![middle] == numToSearchFor) return middle

            if (array!![middle] > numToSearchFor) {
                end = middle - 1
            } else {
                beginning = middle + 1
            }
        }

        return -1
    }
}