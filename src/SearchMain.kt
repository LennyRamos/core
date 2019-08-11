import searchAlgorithms.BinarySearch
import searchAlgorithms.InterpolationSearch
import searchAlgorithms.strategyPattern.ISearchStrategy
import searchAlgorithms.LinearSearch

/**
 * Main to execute all of the Search Algorithms
 */
fun main(args: Array<String>) {
    val arr = arrayOf(
        10, 20, 30, 60, 50, 80, 100, 110, 130, 170, 200
    )

    val searchMap = mutableMapOf<String, ISearchStrategy>(
    )
    searchMap["LinearSearch"] = LinearSearch()
    searchMap["BinarySearch"] = BinarySearch()
    searchMap["InterpolationSearch"] = InterpolationSearch()

    val linearSearch = execute(searchMap["LinearSearch"], arr, 170)
    println("This is the result of linear search >> $linearSearch")

    val binarySearch = execute(searchMap["BinarySearch"], arr, 130)
    println("This is the result of binary search >> $binarySearch")

    val interpolationSearch = execute(searchMap["InterpolationSearch"], arr, 100)
    println("This is the result of interpolation search >> $interpolationSearch")
}

fun execute(strategy: ISearchStrategy?, array: Array<Int>, numToSearch: Int): Int {
    return strategy!!.search(array, numToSearch)
}