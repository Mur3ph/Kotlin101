package ie.murph.objects.Delegation.Movies

import ie.murph.objects.Delegation.Movies.SuperPower

/**
 * Created by Paul on 9/12/2016.
 */
class Batman() : SuperPower
{
    companion object
    {
        fun createTheBat() = Batman()
    }

    override fun inWater()
    {
        println("I am the Bat and I cannot feckin' swim")
    }

    override fun onAir()
    {
        println("I am the Bat and I am floating threw the air")
    }

    override fun onSoil()
    {
        println("I am the Bat and I am stuck in the mud")
    }

    fun isFun() : Boolean
    {
        return false
    }
}