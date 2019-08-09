package searchAlgorithms

import searchAlgorithms.strategyPattern.SearchSolution

/**
 * @author Lenny Ramos
 *
 * Linear Search Algorithm
 * @see <a href="https://www.geeksforgeeks.org/linear-search/">Linear Search</a>
 */

class LinearSearch : SearchSolution() {
    override fun solve(arr: Array<Int>, i: Int): Int {
        array = arr
        numToSearchFor = i

        if (array!!.isEmpty()) {
            return -1
        }

        for (number in array!!) {
            if (number == numToSearchFor) {
                return array!!.indexOf(number)
            }
        }

        return -1
    }
}