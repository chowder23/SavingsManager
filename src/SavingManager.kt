import Saving
class SavingManager {
    var savings = mutableListOf<Saving>()
    fun loadSavings(savings:List<Saving>)
    {
        this.savings=savings.toMutableList()
    }
    fun addNewSaving(newSaving:Saving)
    {
        if(checkExistingSavingByName(newSaving)) throw Exception("Ez a megtakarítás: ${newSaving.name} már létezik!")
        else savings.add(newSaving)
    }


    private fun checkExistingSavingByName(newSaving:Saving):Boolean
    {
        return savings.contains(newSaving)
    }
}