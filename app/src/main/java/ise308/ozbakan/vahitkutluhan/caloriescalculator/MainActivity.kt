package ise308.ozbakan.vahitkutluhan.caloriescalculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        caloriesCalculator()
    }

    private fun caloriesCalculator(){

        //Suppose the user enters her age and weight.
        val teenager = YoungAge("Men",12,150.0,"teenager")
        val elder = ElderYear("Woman",68,170.0,"elder")
        var middle = MiddleAge("Men",50,180.0,"middle")
        val teenagerkilo = 55
        val middlekilo = 69
        val elderkilo = 80
        //And let's assume that the user enters the result on which nutrient they want from the keyboard.
        if(teenagerkilo < 30 && teenagerkilo <= 40)
        {
            teenager.isnowAt=30
            teenager.calculate("Vitamin")
            teenager.getMacroNutrient()
        }
        else if (teenagerkilo > 40 && teenagerkilo <= 50)
        {
            teenager.isnowAt=50
            teenager.calculate("Vitamin")
            teenager.getMacroNutrient()
        }
        else if(teenagerkilo > 50 && teenagerkilo <= 70)
        {
            teenager.isnowAt=70
            teenager.calculate("Vitamin")
            teenager.getMacroNutrient()
        }
        else
        {
            teenager.isnowAt=90
            teenager.calculate("Vitamin")
            teenager.getMacroNutrient()
        }

        if(middlekilo < 30 && middlekilo <= 40)
        {
            middle.isnowAt=30
            middle.calculate("Fat")
            middle.getMacroNutrient()
        }
        else if (middlekilo > 40 && middlekilo <= 50)
        {
            middle.isnowAt=50
            middle.calculate("Fat")
            middle.getMacroNutrient()
        }
        else if(middlekilo > 50 && middlekilo <= 70)
        {
            middle.isnowAt=70
            middle.calculate("Fat")
            middle.getMacroNutrient()
        }
        else
        {
            middle.isnowAt=90
            middle.calculate("Fat")
            middle.getMacroNutrient()
        }

        if(elderkilo < 30 && elderkilo <= 40)
        {
            elder.isnowAt=30
            elder.calculate("Carbohydrate")
            elder.getMacroNutrient()
        }
        else if (elderkilo > 40 && elderkilo <= 50)
        {
            elder.isnowAt=50
            elder.calculate("Carbohydrate")
            elder.getMacroNutrient()
        }
        else if(elderkilo > 50 && elderkilo <= 70)
        {
            elder.isnowAt=70
            elder.calculate("Carbohydrate")
            elder.getMacroNutrient()
        }
        else
        {
            elder.isnowAt=90
            elder.calculate("Carbohydrate")
            elder.getMacroNutrient()
        }
    }
}
