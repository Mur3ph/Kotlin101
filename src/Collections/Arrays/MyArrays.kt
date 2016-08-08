package Collections.Arrays

/**
 * Created by Paul on 8/7/2016.
 */

fun main(args: Array<String>) {
    val chromosome = arrayOf(Pair("X", "0"), Pair(1, 1))
    chromosome.forEach{println("${it.first} ${it.second}")}
    chromosome.forEach{println(it)}

    println("\n")

    val numbers = arrayOf(1,2,3,4,5)
    numbers.forEach{println("numbers " + it)}

    println("\n")

    val bools = booleanArrayOf(true, false, true)
    val bytes = byteArrayOf(1, 2, 3, 4, 5)
    val ints = intArrayOf(1, 2, 3, 4, 5)
    val floats = floatArrayOf(1.0f, 2.0f, 3.0f)
    val doubles = doubleArrayOf(1.0, 2.0, 3.0)
    val longs = longArrayOf(1, 2, 3, 4, 5)
    val chars = charArrayOf('5', '4', '3')
    val shorts = shortArrayOf(1, 2, 3, 4, 5)

    bools.forEach{println("bools " + it)}
    println("\n")
    bytes.forEach{println("bytes " + it)}
    println("\n")
    ints.forEach{println("ints " + it)}
    println("\n")
    floats.forEach{println("floats " + it)}
    println("\n")
    doubles.forEach{println("doubles " + it)}
    println("\n")
    longs.forEach{println("longs " + it)}
    println("\n")
    chars.forEach{println("chars " + it)}
    println("\n")
    shorts.forEach{println("shorts " + it)}
    println("\n")
}
