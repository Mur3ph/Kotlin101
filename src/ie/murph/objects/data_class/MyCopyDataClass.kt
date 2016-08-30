package ie.murph.objects.data_class

/**
 * Created by Paul on 8/30/2016.
 */

data class Footballer(val footballersName: String, val club: String)
{
    public fun printPlayerWithClub()
    {
        println("$footballersName $club")
    }
}