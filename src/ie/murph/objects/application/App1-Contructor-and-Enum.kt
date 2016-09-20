package ie.murph.objects.application

import com.sun.xml.internal.fastinfoset.util.StringArray
import ie.murph.objects.Delegation.Movies.Batman
import ie.murph.objects.Delegation.Movies.BruceWayne
import ie.murph.objects.Delegation.Movies.RichyRich
import ie.murph.objects.Delegation.Tax.ObservableDelegateTaxRate
import ie.murph.objects.Delegation.Tennis.LazyDelegateUmpire
import ie.murph.objects.constructors.DiceConstructor
import ie.murph.objects.constructors.Primary
import ie.murph.objects.data_class.Footballer
import ie.murph.objects.data_class.TennisPlayer
import ie.murph.objects.enums.AiAlgorithms

/**
 * Created by Paul on 8/29/2016.
 */

fun main(args : Array<String>) {
    println(" *** My Constructors *** ")
    var primaryConstruct1 = Primary("Joe Bloggs", 32)
    primaryConstruct1.sayName()

    var primaryConstruct2 = Primary("Jane Doe")
    primaryConstruct2.sayName()
    println("")

    println(" *** My Dice Constructors *** ")
    val dice: DiceConstructor = DiceConstructor(6)
    for (i in 1..10)
    {
        println(dice.Roll())
    }
    println("")

    println(" *** My Enums  *** ")
    var algorithm = AiAlgorithms.BREADTH_FIRST_SEARCH
    val al = AiAlgorithms.values()
    println(algorithm)
    for(a in al)
    {
        println(a)
    }
    println("")
}
