package ie.murph.objects.application

import com.sun.xml.internal.fastinfoset.util.StringArray
import ie.murph.objects.Delegation.Movies.Batman
import ie.murph.objects.Delegation.Movies.BruceWayne
import ie.murph.objects.Delegation.Movies.RichyRich
import ie.murph.objects.constructors.Primary
import ie.murph.objects.data_class.Footballer
import ie.murph.objects.data_class.TennisPlayer
import ie.murph.objects.enums.AiAlgorithms

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

    println(" *** My Enums  *** ")
    var algorithm = AiAlgorithms.BREADTH_FIRST_SEARCH
    val al = AiAlgorithms.values()
    println(algorithm)
    for(a in al)
    {
        println(a)
    }
    println("")

    println(" *** My Delegation - To be able to automatically assign an Object to handle any Interface *** ")
    var me = BruceWayne(Batman(), RichyRich())
    me.inWater() //Batman
    println("Is Richard awesomely rich? " + me.isAwesomelyRich())
    println("")
}

// MyDataClass file using data class features
public fun playTennis()
{
    var tennisPlayerOne = TennisPlayer("Roger", "Federer")
    var tennisPlayerTwo = TennisPlayer("Roger", "Federer")
    var tennisPlayerThree = TennisPlayer("Pete", "Sampras")

    //Tennis player, atomatic tostring() generation
    println("Tennis player is ${tennisPlayerOne.toString()}")

    //Atomatic hashCode
    println("Tennis player is ${tennisPlayerOne.hashCode()}")

    //Auto generated equals() function
    var areTheyEqual = tennisPlayerOne.equals(tennisPlayerTwo)
    println("Is the first tennis player equal to the second: $areTheyEqual")

    val isFirstName = tennisPlayerThree.firstName.equals(tennisPlayerThree.component1())
    println("is .firstName equals to .component1? $isFirstName")

    var isSecondName = tennisPlayerThree.lastName.equals(tennisPlayerThree.component2())
    println("is .lastName equals to .component2? $isSecondName")

    // Multi declarations
    val tennisPlayer = { x : TennisPlayer -> x}
    val(firstName, lastName ) = tennisPlayer(tennisPlayerOne)
    println("Our tennis player name is $firstName $lastName")

    val(firstName2, lastName2) = superCharge(tennisPlayerOne)
    println("Our super charged tennis player name is $firstName2 $lastName2")
}

// Another sample of multi declarations
fun superCharge(x : TennisPlayer) : TennisPlayer
{
    var m = TennisPlayer(x.firstName.toUpperCase(), x.lastName.toLowerCase())
    return m
}