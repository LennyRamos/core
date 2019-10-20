package utils

/**
 * This will be the custom logger for use in this project
 */
class Log<T> constructor(classType: Class<in T>) {

    private val s: String = "[" + classType.simpleName + "] : "

    fun write(input: String) {
        println(s + input)
    }
}