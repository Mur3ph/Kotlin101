package ie.murph.collections.Map

/**
 * Created by Paul on 8/9/2016.
 */

class MyMap{

    // English to Chinese translation
    fun main(args: Array<String>) {

    }

    fun pairEnglishToChineseTranslation()
    {
        val dictionary = hashMapOf(
                "Hello" to "Ni hao",
                "Thank you" to "Xie Xie Ni",
                "See ya" to "Zai Jian "
        )

        println("Hello in chinese: ${dictionary["Hello"]}" )

        //This is called multi declaration, where you assign each paired key and value to seperate variables
        for ((myKey, myValue) in dictionary)
            println("Key in $myKey has a value of $myValue")

        for(myKey in dictionary.keys)
            println("Key in '$myKey' with a value of '${dictionary[myKey]}'")

        println("Now, looping using the entrySet")

        for(n in dictionary.entries)
            println("Key ${n.key} has a value of ${n.value}")
    }

}
