package searchAlgorithms.strategyPattern

/**
 * @author Lenny Ramos
 */
abstract class SearchSolution : ISearchStrategy {

    override var numToSearchFor: Int = 0

    override var array: Array<Int>? = null

    override var index: Int = -1

    override fun search(arr: Array<Int>, i: Int): Int {
        return solve(arr, i)
    }

    abstract fun solve(arr: Array<Int>, i: Int): Int
}