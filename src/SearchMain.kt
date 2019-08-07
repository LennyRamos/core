import searchAlgorithms.BinarySearch
import searchAlgorithms.LinearSearch

fun main(args: Array<String>) {
    val arr = arrayOf(
        10, 20, 30, 60, 50, 80, 110, 100, 130, 170, 200
    )

    val linearSearch = LinearSearch()
    println(linearSearch.doLinearSearch(arr, 130))

    val binarySearch = BinarySearch()
    println(binarySearch.doBinarySearch(arr, 170))

}