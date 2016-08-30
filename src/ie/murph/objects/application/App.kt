package ie.murph.objects.application

import ie.murph.objects.constructors.Primary
import ie.murph.objects.data_class.Footballer
import ie.murph.objects.data_class.TennisPlayer

/**
 * Created by Paul on 8/29/2016.
 */

fun main(args : Array<String>)
{
    println(" *** My Constructors *** ")
    var primaryConstruct1 = Primary("Joe Bloggs", 32)
    primaryConstruct1.sayName()

    var primaryConstruct2 = Primary("Jane Doe")
    primaryConstruct2.sayName()
    println("")

    println(" *** My Data Class using data class features *** ")
    val tennisPlayer = TennisPlayer("Roger", "Federer")
    tennisPlayer.playTennis()
    println("")

    println(" *** My Data Class using Copy functon *** ")
    val footballerOne = Footballer("Roy Keane", "Man. Utd")
    footballerOne.printPlayerWithClub()

    //Using the 'copy' function
    val footballerTwo = footballerOne.copy(footballersName = "Paul Scholes")
    footballerTwo.printPlayerWithClub()
    println("")

}