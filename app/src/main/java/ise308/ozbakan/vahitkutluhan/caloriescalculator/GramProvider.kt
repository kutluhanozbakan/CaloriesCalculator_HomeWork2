package ise308.ozbakan.vahitkutluhan.caloriescalculator
const val INVALID_ARG = -1
class GramProvider {
    //In health science, it is possible to calculate the macronutrients and calories
    // that a person should take according to their weight range. These weight ranges
    // are set at 30, 50, 70 and 90 for reference. These references are used as +10 -10.
    // For example, a 60kg person should choose 70kg as the reference range.
    // Or a 49 kilogram person should choose 50 kilograms as the reference range.

    //The values ​​of the macronutrients that should be taken according to each weight range vary.
    private val kilograms: Array<Int> = arrayOf(30,50,70,90)
    private val nutrient: Array<String> = arrayOf("Carbohydrate","Protein","Fat","Vitamin")

    private val nutrientMatrix = arrayOf(
        arrayOf(30, 40, 10 ,50),
        arrayOf(45, 40, 5 ,50),
        arrayOf(25, 45, 5 ,45),
        arrayOf(30, 30, 10 ,50)
    )
    //With the getgram function, we send the matrix multiplication and
    // the values ​​it needs to get according to its weight.
    fun getGram(kilogram: Int, value: String): Int {
        return if (kilogram in kilograms || value in nutrient)
                 nutrientMatrix[kilograms.indexOf(kilogram)][nutrient.indexOf(value)]
        else
            INVALID_ARG


    }

}