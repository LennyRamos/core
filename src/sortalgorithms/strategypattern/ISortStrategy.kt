package sortalgorithms.strategypattern

/**
 *  @author Lenny Ramos
 *
 * @see <a href="https://sourcemaking.com/design_patterns/strategy">Strategy Pattern</a>s
 */
interface ISortStrategy {
    var array: Array<Int>?
    var index: Int
    fun sort(arr: Array<Int>): Array<Int>
}