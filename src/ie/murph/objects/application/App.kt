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
    playTennis()
    println("")

    println(" *** My Data Class using Copy functon *** ")
    val footballerOne = Footballer("Roy Keane", "Man. Utd")
    footballerOne.printPlayerWithClub()

    //Using the 'copy' function
    val footballerTwo = footballerOne.copy(footballersName = "Paul Scholes")
    footballerTwo.printPlayerWithClub()
    println("")

}

public fun playTennis()
{
    val tennisPlayerOne = TennisPlayer("Roger", "Federer")
    val tennisPlayerTwo = TennisPlayer("Pete", "Sampras")

    //Tennis player, atomatic tostring() generation
    println("Tennis player is ${tennisPlayerOne.toString()}")

    //Atomatic hashCode
    println("Tennis player is ${tennisPlayerOne.hashCode()}")

    //Auto generated equals() function
    var areTheyEqual = tennisPlayerOne.equals(tennisPlayerTwo)
    println("Is the first tennis player equal to the second: $areTheyEqual")


}