import Saving
import java.lang.Exception

fun main()
{

<<<<<<< HEAD
    try
    {
        testSavingManagerAddNewSaving()
        testSavingManagerSave()
        testSavingManagerLoad()
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

fun testSavingManagerLoad()
{
    var mySavingManager = SavingManager()
    mySavingManager.InitFileManager("savings.txt")
    mySavingManager.Load()
=======
   
>>>>>>> master
}