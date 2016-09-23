package ie.murph.objects.application

import ie.murph.objects.nested.Wimbledon

/**
 * Created by Paul on 9/23/2016.
 */

fun main(args: Array<String>) {
    // Nested objects within Wimbledon object
    var wimbledon = Wimbledon()
    var roger = Wimbledon.RogerFederer()
    var novak = Wimbledon.NovakDjokovic()
    var rafa = Wimbledon.RafaelNadal()

    wimbledon.welcome()
    roger.welcome()
    novak.welcome()
    rafa.welcome()
}