package ie.murph.application
import ie.murph.collections.List.MyList

/**
 * Created by Paul on 8/6/2016.
 */

fun main(args : Array<String>){
    var message: String = "Hello, Pauly"
    val number: Int = 28
    println(message)

    val list = MyList()
    println(list.pairEnglishToFrenchTranslation())
}
