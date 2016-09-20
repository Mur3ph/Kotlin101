package ie.murph.objects.application

import ie.murph.objects.Delegation.Movies.Batman
import ie.murph.objects.Delegation.Movies.BruceWayne
import ie.murph.objects.Delegation.Movies.RichyRich
import ie.murph.objects.Delegation.Tax.ObservableDelegateTaxRate
import ie.murph.objects.Delegation.Tennis.LazyDelegateUmpire

/**
 * Created by Paul on 9/20/2016.
 */

fun main(args: Array<String>) {
    println("")
    println(" *** My Delegation - To be able to automatically assign an Object to handle any Interface *** ")
    println("")
    var me = BruceWayne(Batman(), RichyRich())
    me.inWater() //Batman
    println("Is Richard awesomely rich? " + me.isAwesomelyRich())
    println("")

    println("*** Lazy Delegation")
    val umpire = LazyDelegateUmpire()
    println("Lazy = ${umpire.lazy}")
    println("Lazy = ${umpire.lazy}")
    println("Lazy = ${umpire.increments}")
    println("")

    println("*** Observable Delegation")
    val rate = ObservableDelegateTaxRate()
    rate.value = 19.0f
    println("")
}