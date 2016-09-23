package ie.murph.objects.application

import ie.murph.objects.delegation.Movies.Batman
import ie.murph.objects.delegation.Movies.BruceWayne
import ie.murph.objects.delegation.Movies.RichyRich
import ie.murph.objects.delegation.Tax.ObservableDelegateTaxRate
import ie.murph.objects.delegation.Tennis.LazyDelegateUmpire

/**
 * Created by Paul on 9/20/2016.
 */

fun main(args: Array<String>) {
    println("")
    println(" *** My delegation - To be able to automatically assign an Object to handle any Interface *** ")
    println("")
    var me = BruceWayne(Batman(), RichyRich())
    me.inWater() //Batman
    println("Is Richard awesomely rich? " + me.isAwesomelyRich())
    println("")

    println("*** Lazy delegation")
    val umpire = LazyDelegateUmpire()
    println("Lazy = ${umpire.lazy}")
    println("Lazy = ${umpire.lazy}")
    println("Lazy = ${umpire.increments}")
    println("")

    println("*** Observable delegation")
    val rate = ObservableDelegateTaxRate()
    rate.value = 19.0f
    println("")
}