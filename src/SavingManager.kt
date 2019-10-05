import Saving
class SavingManager {

    var savings = mutableListOf<Saving>()

    fun loadSavings(savings:List<Saving>)
    {
        this.savings=savings.toMutableList()
    }
    fun addNewSaving( name:String, monthlySavingAmount:Double, desiredAmount:Double)
    {
        val newSaving = Saving(nextId(),name,monthlySavingAmount,desiredAmount)
        if(checkExistingSavingByName(newSaving)) throw Exception("Ez a megtakarítás: ${newSaving.name} már létezik!")
        else savings.add(newSaving)
    }

    private fun nextId():Int
    {
        var nextId:Int =0
        for (saving in savings)
        {
            if(saving.getId()>=nextId) nextId=saving.getId()+1
        }

        return nextId
    }
    private fun checkExistingSavingByName(newSaving:Saving):Boolean
    {
        return savings.contains(newSaving)
    }

    fun getSavingsNames():List<String>
    {
        var savingsNames = mutableListOf<String>()
        for(saving in savings)
            {
                savingsNames.add(saving.name)
            }
        return savingsNames
    }


}