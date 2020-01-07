package udemy.datastructuresandalgorithms.basics.recursion

/**
 * This is the first example of recursion with explanation of how it works internally
 */
object RecursionExampleOne {
    fun foo(n: Int) {
        if (n < 1) {
            return
        }
        foo(n - 1)
        println("Hello World $n")
    }
}