package ie.murph.objects.Delegation.Tennis

/**
 * Created by Paul on 9/15/2016.
 */
class LazyUmpire
{
    var increments : Int = 15

    val lazy : String by lazy{
        println("Assigned.!")
        (increments++).toString()
    }
}