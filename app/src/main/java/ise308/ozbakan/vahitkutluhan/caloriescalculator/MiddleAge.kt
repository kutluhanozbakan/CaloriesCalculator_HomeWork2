package ise308.ozbakan.vahitkutluhan.caloriescalculator

import android.util.Log
//A message is given according to the age of the user.
class MiddleAge (Gender: String,Year: Int,Height: Double,ElderType: String):Human(Gender,Year,Height){
    override fun getMacroNutrient() {
        Log.i(TAG, "getMacroNutrient: You are of a good age. Don't forget to take your Macro Nutrients! ")
    }

    companion object{
        const val TAG = "Person's Middle Age"
    }

}