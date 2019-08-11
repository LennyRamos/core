package searchAlgorithms

import searchAlgorithms.strategyPattern.SearchSolution

/**
 * @author Lenny Ramos
 *
 * Linear Search Algorithm
 * @see <a href="https://www.geeksforgeeks.org/linear-search/">Linear Search</a>
 */

class InterpolationSearch : SearchSolution() {
    override fun solve(arr: Array<Int>, i: Int): Int {

        var beginning = 0
        var end: Int = arr.size - 1
        var pos: Int

        if (arr[arr.size-1] < i  || i < arr[0] )
        {
            return -1
        }

        while (beginning <= end) {
            pos = beginning + ((i - arr[beginning]) * (end - beginning) / (arr[end] - arr[beginning]))

            if (arr[pos] == i) {
                return pos
            }

            if (arr[pos] > i) {
                end = pos - 1
                continue
            }

            if (arr[pos] < i) {
                beginning = pos + 1
                continue
            }
        }

        return -1
    }
}