package searchalgorithms

import searchalgorithms.strategypattern.SearchSolution

/**
 * @author Lenny Ramos
 *
 * Exponential Search Algorithm
 * @see <a href="https://www.geeksforgeeks.org/exponential-search/">Linear Search</a>
 */

class ExponentialSearch : SearchSolution() {
    override fun solve(arr: Array<Int>, i: Int): Int {
        val bS: BinarySearch = BinarySearch()

        if (arr[0] == i) {
            return 0
        }

        var index = 1
        while (index < arr.size && arr[index] <= i) {
            index *= 2
        }

        val binReturn: Int = bS.search(arr.sliceArray((index/2) until arr.size), i)
        if (binReturn == -1) {
            return -1
        }

        return ( binReturn + (index/2))
    }
}