package Collections.List

/**
 * Created by Paul on 8/7/2016.
 */
fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    list.forEach { println(it) }

    val list2 = arrayListOf(
            Pair("Hello", "Bonjour / Bonsoir"),
            Pair("Good bye", "Au revoir"),
            Pair("Thank you", "Merci beaucoup")
    )

    list2.add(Pair("Ireland", "Irlande"))

    list2.forEach { println("${it.first} - ${it.second}") }
}