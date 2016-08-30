package ie.murph.objects.data_class

/**
 * Created by Paul on 8/30/2016.
 */

public data class TennisPlayer(val firstName : String, val lastName : String)
{
    // This is to demonstrate various features that we can use from implementing a Data Class

    public fun playTennis()
    {
        //Tennis player
        println("Tennis player is ${this.firstName} ${this.lastName}")

        //Atomatic hashCode
        println("Tennis player is ${this.hashCode()}")
    }
}