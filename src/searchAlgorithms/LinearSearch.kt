package searchAlgorithms

/**
 * @author Lenny Ramos
 *
 * Linear Search Algorithm
 * @see <a href="https://www.geeksforgeeks.org/linear-search/">Linear Search</a>
 */

class LinearSearch {

    fun doLinearSearch(array: Array<Int>, numToSearch: Int): Int {
        if (array.isEmpty()) {
            return -1
        }

        for (number in array) {
            if (number == numToSearch) {
                return array.indexOf(number)
            }
        }

        return -1
    }
}