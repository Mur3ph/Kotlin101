package ie.murph.objects.delegation.Movies

import ie.murph.objects.delegation.Movies.Wealth

/**
 * Created by Paul on 9/12/2016.
 */
class RichyRich : Wealth
{
    override fun isAwesomelyRich(): Boolean {
       return true
    }
}