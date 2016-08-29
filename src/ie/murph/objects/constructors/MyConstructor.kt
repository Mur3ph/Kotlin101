package ie.murph.objects.constructors

/**
 * Created by Paul on 8/29/2016.
 */

class Primary(initialName : String, age : Int = 30)
{

    var m_firstName = initialName
    val m_age = age

    init
    {
        //This is an anonymous constructor
        //There is no other typ of constructor
        m_firstName += ".jr"
    }

    public fun sayName()
    {
        println("My name is $m_firstName and I am $m_age years of age")
    }

}