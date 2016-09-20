package ie.murph.objects.application

import ie.murph.objects.Inheritance.FinalConstruct
import ie.murph.objects.Inheritance.LessFlexible

/**
 * Created by Paul on 9/20/2016.
 */

fun main(args: Array<String>) {
    // Simple final class
    var final = FinalConstruct("Pól Ó Murchú")
    println("He goes by the name of ${final.name}")

    println("")

    // Derived class with two traits
    var less = LessFlexible("Gerald Ó Murchú")
    println("He goes by the name of ${less.name}")
    less.banjo()
    less.tennis()
}