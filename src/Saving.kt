import java.time.LocalDateTime
import java.util.*

class Saving(val name:String, val monthlySavingAmount:Double, val desiredAmmount:Double) {
    val savingStartDateTime = LocalDateTime.now()
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

    override fun toString(): String {
        return "Saving name: $name \n" +
                "Saving amount: ${getSavingAmount()} \n" +
                "Desired amount: $desiredAmmount \n" +
                "Start date: $savingStartDateTime" +
                "Elapsed months: ${getElapsedMonths()}" +
                "Time to reach goal: ${getMonthsToReachGoal()}"
    }
}