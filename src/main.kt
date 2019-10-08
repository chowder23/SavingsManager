import Saving
import java.lang.Exception

fun main()
{


    try
    {
        //testSavingManagerAddNewSaving()
        //testSavingManagerSave()
        //testSavingManagerLoad()
        //testSavingManagerAddAmountToSaving()
        testSavingManagerAllDataShow()

    }
    catch(exp:Exception)
    {
        println(exp.message)
    }
}

fun PrintOutSavings(mySavingManager:SavingManager)
{
    for (saving in mySavingManager.savings)
    {
        println(saving.toString())
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
}

fun testSavingManagerAddAmountToSaving()
{
    var mySavingManager = SavingManager()
    mySavingManager.addNewSaving("ház",500.0,50000.0)
    PrintOutSavings(mySavingManager)
    mySavingManager.addAmountToSaving("ház",5000.0)
    PrintOutSavings(mySavingManager)
}

fun testSavingManagerAllDataShow()
{
    var mySavingManager = SavingManager()
    mySavingManager.addNewSaving("ház",500.0,50000.0)
    mySavingManager.addNewSaving("kocsi",500.0,50000.0)
    mySavingManager.setMySalary(80000.0)
    for (line in mySavingManager.getAllData())
    {
        println(line)
    }

}