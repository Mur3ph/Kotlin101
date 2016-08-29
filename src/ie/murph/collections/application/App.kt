package ie.murph.collections.application
import ie.murph.collections.Arrays.MyArray
import ie.murph.collections.List.MyList
import ie.murph.collections.Map.MyMap

/**
 * Created by Paul on 8/6/2016.
 */

fun main(args : Array<String>){
    var message: String = "Hello, Pauly"
    //val number: Int = 28
    println(message)

    println("")
    println("NUMBERS")
    val arr = MyArray()
    println(arr.differentTypesOfNumbers())

    println("")
    println("FRENCH")
    val list = MyList()
    println(list.pairEnglishToFrenchTranslation())

    println("")
    println("CHINESE")
    val map = MyMap()
    println(map.pairEnglishToChineseTranslation())
}
