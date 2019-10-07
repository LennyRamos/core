package searchalgorithms

import searchalgorithms.strategypattern.ISearchStrategy

/**
 * Controller to execute specific search algorithm over a specified array.
 * If no specified array then do search on default
 */
class SearchAlgorithms {

    /**
     * The default array if non is passed
     */
    private var constantArray: Array<Int> = arrayOf(
        10, 20, 30, 60, 50, 80, 100, 110, 130, 170, 200
    )

    private var defaultNumToSearchFor: Int = 100

    /**
     * Container for all search Algorithms
     */
    private val searchMap = mutableMapOf<String, ISearchStrategy>()

    init {
        searchMap["LinearSearch"] = LinearSearch()
        searchMap["BinarySearch"] = BinarySearch()
        searchMap["InterpolationSearch"] = InterpolationSearch()
        searchMap["ExponentialSearch"] = ExponentialSearch()
    }

    /**
     * Main method to execute specific search pattern by user
     */
    fun search(arr: Array<Int> = constantArray, strategy: String = "LinearSearch", numToSearch: Int = defaultNumToSearchFor) {

        val numberFoundAtIndex: Int = when (strategy) {
            "LinearSearch" -> execute(searchMap[strategy], arr, numToSearch)
            "BinarySearch" -> execute(searchMap[strategy], arr, numToSearch)
            "InterpolationSearch" -> execute(searchMap[strategy], arr, numToSearch)
            "ExponentialSearch" -> execute(searchMap[strategy], arr, numToSearch)
            else -> {
                println("Could not find that search algorithm to execute")
                return
            }
        }

        printUsedArray(arr)
        println("This is the result of $strategy search >> $numToSearch found at index[$numberFoundAtIndex]")
    }

    private fun printUsedArray(array: Array<Int>) {
        print("Using this array of Numbers >> [")
        for (a:Int in array) {
            print("$a,")
        }
        println("]")
    }

    private fun execute(strategy: ISearchStrategy?, array: Array<Int>, numToSearch: Int): Int {
        return strategy!!.search(array, numToSearch)
    }

    fun getDefaultArray(): Array<Int>? {
        return constantArray
    }
}