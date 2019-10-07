import Saving
import java.lang.Exception

fun main()
{

    try
    {
        testSavingManagerAddNewSaving()
        testSavingManagerSave()
    }
    catch(exp:Exception)
    {
        println(exp.message)
    }
}

fun testSavingManagerAddNewSaving()
{
    var mySavingManager = SavingManager()
    mySavingManager.addNewSaving("ház",500.0,50000.0)
}

fun testSavingManagerSave()
{
    var mySavingManager = SavingManager()
    mySavingManager.addNewSaving("ház",500.0,50000.0)
    mySavingManager.InitFileManager("savings.txt")
    mySavingManager.Save()
}