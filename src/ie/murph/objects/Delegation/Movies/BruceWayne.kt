package ie.murph.objects.Delegation.Movies

import ie.murph.objects.Delegation.Movies.Batman
import ie.murph.objects.Delegation.Movies.RichyRich
import ie.murph.objects.Delegation.Movies.SuperPower
import ie.murph.objects.Delegation.Movies.Wealth

/**
 * Created by Paul on 9/12/2016.
 */
class BruceWayne(a : Batman, b : RichyRich) : SuperPower by a, Wealth by b
{
    //To be able to automatically assign an Object to handle any Interface
}