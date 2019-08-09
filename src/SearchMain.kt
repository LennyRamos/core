import searchAlgorithms.BinarySearch
import searchAlgorithms.strategyPattern.ISearchStrategy
import searchAlgorithms.LinearSearch

/**
 * Main to execute all of the Search Algorithms
 */
fun main(args: Array<String>) {
    val arr = arrayOf(
        10, 20, 30, 60, 50, 80, 110, 100, 130, 170, 200
    )

    val searchMap = mutableMapOf<String, ISearchStrategy>(
    )
    searchMap["LinearSearch"] = LinearSearch()
    searchMap["BinarySearch"] = BinarySearch()

    execute(searchMap["LinearSearch"], arr, 170)
    execute(searchMap["BinarySearch"], arr, 130)
}

fun execute(strategy: ISearchStrategy?, array: Array<Int>, numToSearch: Int): Int {
    return strategy!!.search(array, numToSearch)
}