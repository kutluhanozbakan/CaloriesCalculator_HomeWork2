package ise308.ozbakan.vahitkutluhan.caloriescalculator

import android.util.Log
//A message is given according to the age of the user.
class YoungAge (Gender: String,Year: Int,Height: Double,ElderType: String):Human(Gender,Year,Height){
    override fun getMacroNutrient() {
        Log.i(TAG, "getMacroNutrient: Make sure to take macronutrients for your growth! ")
    }

    companion object{
        const val TAG = "Human's Young Age"
    }

}