package sortalgorithms

import sortalgorithms.strategypattern.SortSolution

/**
 * @author Lenny Ramos
 *
 * Selection Sort Algorithm
 * @see <a href="https://www.geeksforgeeks.org/selection-sort/">Selection Sort</a>
 */
class SelectionSort : SortSolution() {
    override fun solve(arr: Array<Int>): Array<Int> {
        val sortedArray: Array<Int> = arrayOf(arr.size)
        var index: Int = 0
        var least: Int = arr[index]

        for (a: Int in arr) {

            if (least > a) {
                least = a
            }


            sortedArray[index] = least
            index++
        }

        return sortedArray
    }
}