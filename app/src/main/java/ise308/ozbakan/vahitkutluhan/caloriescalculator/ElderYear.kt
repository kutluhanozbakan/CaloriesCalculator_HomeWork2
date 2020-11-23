package ise308.ozbakan.vahitkutluhan.caloriescalculator

import android.util.Log
//A message is given according to the age of the user.
class ElderYear (Gender: String,Year: Int,Height: Double,ElderType: String):Human(Gender,Year,Height){
    override fun getMacroNutrient() {
        Log.i(TAG, "getMacroNutrient: You have to take care yourself. You are too old. ")
    }

    companion object{
        const val TAG = "Human's Elder Year"
    }

}