import Saving
class SavingManager {
    var savings = mutableListOf<Saving>()
    fun loadSavings(savings:List<Saving>)
    {
        this.savings=savings.toMutableList()
    }
    fun addNewSaving(newSaving:Saving) =savings.add(newSaving)

}