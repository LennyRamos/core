package udemy.datastructuresandalgorithms.basics.algoruntimeanalysis

/**
 * Find time complexity of unsorted array
 *
 */
object AlgoRunTimeExampleTwo {

    @JvmStatic
    var highest = Int.MIN_VALUE

    fun FindBiggestNumber(array: Array<Int>, sizeOfArray: Int): Int {               // T(n)

        return if (sizeOfArray == -1) {                                             // O(1)
            highest
        } else {
            if (array[sizeOfArray] > highest) {                                     // O(1)
                highest = array[sizeOfArray]                                        // O(1)
            }
            FindBiggestNumber(array, sizeOfArray - 1)                   // T(n-1)
        }
    }

    // T(n) = O(1) + T(n-1)         -- Equation 1
    // T(-1) = O(1)                 -- Base Condition
    // T(n-1) = O(1) + T((n-1)-1)   -- Equation 2
    // T(n-2) = O(1) + T((n-2)-1)   -- Equation 3
    // .
    // .
    // .
    // T(n) = 1 + T(n-1)
    // T(n) = 1 + ( 1 + T((n-1)-1))
    // T(n) = 2 + T(n-2)
    // T(n) = 2 + 1 + T((n-2)-1)
    // T(n) = 3 + T(n-3)
    // T(n) = k + T(n-k)
    // T(n) = (n+1) + T(n-(n+1))        replace k with n+1
    // T(n) = n + 1 + T(-1)
    // T(n) = n + 1 + 1
    // T(n) = n + 2
    // T(n) = O(n)

}