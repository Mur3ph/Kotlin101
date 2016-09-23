package ie.murph.objects.delegation.Tennis

/**
 * Created by Paul on 9/15/2016.
 */
class LazyDelegateUmpire
{
    var increments : Int = 15

    val lazy : String by lazy{
        println("Assigned.!")
        (increments++).toString()
    }
}