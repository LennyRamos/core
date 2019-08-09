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

    val linearSearch = execute(searchMap["LinearSearch"], arr, 170)
    println("This was the result of linear search >> $linearSearch")
    
    val binarySearch = execute(searchMap["BinarySearch"], arr, 130)
    println("This was the result of binary search >> $binarySearch")
}

fun execute(strategy: ISearchStrategy?, array: Array<Int>, numToSearch: Int): Int {
    return strategy!!.search(array, numToSearch)
}