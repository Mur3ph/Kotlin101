package ie.murph.objects.constructors

import java.util.*

/**
 * Created by Paul on 9/15/2016.
 */
class DiceConstructor(value : Int)
{
    private val _randomValue : Random = Random()
    private val _value : Int

    init
    {
        this._value = value
    }

    public fun Roll() : Int = _randomValue.nextInt(this._value) + 1
}