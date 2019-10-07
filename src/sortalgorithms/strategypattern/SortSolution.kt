package sortalgorithms.strategypattern

/**
 * @author Lenny Ramos
 */
abstract class SortSolution : ISortStrategy {

    override var array: Array<Int>? = null

    override var index: Int = -1

    override fun sort(arr: Array<Int>): Array<Int> {
        return solve(arr)
    }

    abstract fun solve(arr: Array<Int>): Array<Int>
}