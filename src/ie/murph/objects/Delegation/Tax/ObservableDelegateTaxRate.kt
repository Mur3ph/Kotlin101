package ie.murph.objects.delegation.Tax

import kotlin.properties.Delegates

/**
 * Created by Paul on 9/16/2016.
 */
class ObservableDelegateTaxRate
{
    // The "d" seems to be the observable object property
    var value: Float by Delegates.observable(18.5f){
        d, oldTaxRate, newTaxRate ->
        println("Rate changed from $oldTaxRate% to $newTaxRate% and the object $d")
    }
}