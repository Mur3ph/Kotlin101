package ie.murph.objects.application

import ie.murph.objects.constructors.Primary

/**
 * Created by Paul on 8/29/2016.
 */

fun main(args : Array<String>)
{
    var primaryConstruct1 = Primary("Joe Bloggs", 32)
    primaryConstruct1.sayName()

    var primaryConstruct2 = Primary("Jane Doe")
    primaryConstruct2.sayName()

}