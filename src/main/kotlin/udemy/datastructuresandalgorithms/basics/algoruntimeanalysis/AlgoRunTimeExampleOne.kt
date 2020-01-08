package udemy.datastructuresandalgorithms.basics.algoruntimeanalysis

/**
 * This is the first example of Iterative Time Complexity
 *
 * This is an example for an unsorted list
 *
 * algorithm goes from the first thing in the list until the last
 */
class AlgoRunTimeExampleOne {

    fun FindBiggestNumber(array: Array<Int>): Int {
        var biggest = array[0]                                // O(1)

        for (number: Int in array) {                   // O(n) ---\   O(n)
            if (number > biggest) {         // O(1) ---\  O(1) ---/
                biggest = number            // O(1) ---/
            }
        }

        return biggest                                            // O(1)
    }

    // Combine the last O(1) + O(n) + O(1)  == O(n) for this particular algorithm
}