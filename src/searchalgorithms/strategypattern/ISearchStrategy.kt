package searchalgorithms.strategypattern

/**
 * @author Lenny Ramos
 *
 * @see <a href="https://sourcemaking.com/design_patterns/strategy">Strategy Pattern</a>s
 */
interface ISearchStrategy {
    var array: Array<Int>?
    var numToSearchFor: Int
    var index: Int
    fun search(arr: Array<Int>, i: Int): Int
}