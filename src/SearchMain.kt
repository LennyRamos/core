import searchAlgorithms.LinearSearch

fun main(args: Array<String>) {
    val arr = arrayOf(
        10, 20, 80, 30, 60, 50,
        110, 100, 130, 170, 200
    )

    val linearSearch = LinearSearch()
    println(linearSearch.linearSearch(arr, 130))
}