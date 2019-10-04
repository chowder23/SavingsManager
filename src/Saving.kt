import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import java.util.function.BooleanSupplier

class Saving(val name:String, val monthlySavingAmount:Double, val desiredAmmount:Double) {
    val savingStartDateTime = LocalDate.now()
    private var elapsedMonths:Int = savingStartDateTime.monthValue.toInt() - LocalDateTime.now().monthValue.toInt()


    fun toSaveFormat():String{
        return "$name+|$monthlySavingAmount+|$desiredAmmount+|$savingStartDateTime"
    }

    fun getElapsedMonths():Int
    {
        return elapsedMonths
    }

    fun getSavingAmount():Double
    {
        return monthlySavingAmount*elapsedMonths
    }

    fun getMonthsToReachGoal():Int
    {
        return (desiredAmmount/monthlySavingAmount).toInt()-getElapsedMonths()
    }

    override fun equals(other: Any?): Boolean {
        val otherSaving = other as Saving
        if (otherSaving.name == name) return true else return false
    }
    override fun toString(): String {
        return "Saving name: $name \n" +
                "Saving amount: ${getSavingAmount()} \n" +
                "Desired amount: $desiredAmmount \n" +
                "Start date: ${savingStartDateTime} \n" +
                "Elapsed months: ${getElapsedMonths()} \n" +
                "Time to reach goal: ${getMonthsToReachGoal()} \n"
    }
}