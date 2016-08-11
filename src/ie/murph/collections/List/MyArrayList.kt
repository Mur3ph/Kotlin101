package ie.murph.collections.List

/**
 * Created by Paul on 8/7/2016.
 */

class MyList{

    fun main(args: Array<String>)
    {
        println(pairEnglishToFrenchTranslation())
    }

    fun pairEnglishToFrenchTranslation()
    {
        val list = arrayListOf(1, 2, 3)
        list.forEach { println(it) }

        //English to French translation
        val list2 = arrayListOf(
                Pair("Hello", "Bonjour / Bonsoir"),
                Pair("Good bye", "Au revoir"),
                Pair("Thank you", "Merci beaucoup")
        )

        list2.add(Pair("Ireland", "Irlande"))

        return list2.forEach { println("${it.first} - ${it.second}") }
    }

}
