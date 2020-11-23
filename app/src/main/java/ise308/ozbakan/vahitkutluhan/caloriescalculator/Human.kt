package ise308.ozbakan.vahitkutluhan.caloriescalculator
import android.nfc.Tag
import android.util.Log

//We get the necessary information from the user.
abstract class Human(val Gender: String, val Year: Int, val Height: Double) {
    var isnowAt: Int = 0
    constructor(Gender: String, Year: Int, Height: Double, isnowAt: Int):this(Gender,Year,Height)
    {
        this.isnowAt = isnowAt //kilogram
    }
    init {
        //We indicate the gender and age of the user.
        Log.i(TAG,"Ypu are a $Gender and your are $Year years old.")
    }
    fun calculate(values: String) //values
    {
        //We take the macronutrient values ​​that the user should take according to the weight he enters.
        val gramprovider: GramProvider = GramProvider()
        val valuescal = gramprovider.getGram(isnowAt,values)

        if(isnowAt < 30)
        {
            Log.i(TAG,"calculate: You need to take weight.")
        }
        else if (isnowAt > 90)
        {
            Log.i(TAG,"calculate: You need to lose weight.")
        }
        else
        {
            //When the macronutrient value that a person should take is multiplied
            // by his age and 4, the pure calorie calculation that the user should take comes out.
            var totalcal = valuescal* 4 * Year
            Log.i(TAG, "calculate: Your kilo is $isnowAt and your Height is $Height")
            Log.i(TAG, "calculate: You have to take $valuescal gram of $values")
            Log.i(TAG, "calculate: And you have to get $totalcal calories.")
            Log.i(TAG, "calculate: And you have to get calories in every 2 hours: ${dayCalories(totalcal)} calories. ")

        }

    }
    //We calculate the calories that the user should take every 2 hours within 24 hours.
     private fun dayCalories(twentyhourcal: Int): String
     {
            var hours = (twentyhourcal/12).toInt()
            return "$hours"
     }

    abstract fun getMacroNutrient()

    companion object{
        const val TAG = "PERSON"
    }
}