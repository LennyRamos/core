import hackerrank.problemsolving.SimpleArraySum
import searchalgorithms.*

/**
 * @author Lenny Ramos
 *
 * Main to execute all of the Different Algorithms
 */
fun main(args: Array<String>) {

    val searchAlgorithms = SearchAlgorithms()
    searchAlgorithms.search(strategy = "BinarySearch", numToSearch = 130)

    val simpleArraySum = SimpleArraySum();
    simpleArraySum.run(args);
}

