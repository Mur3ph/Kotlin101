package ie.murph.objects.data_class

/**
 * Created by Paul on 8/30/2016.
 */

public data class TennisPlayer(val firstName : String, val lastName : String)
{
    // This is to demonstrate various features that we can use from implementing a Data Class

    //Override the toString() function
    override fun toString(): String = firstName + " " + lastName
}