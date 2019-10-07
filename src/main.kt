import Saving
import java.lang.Exception

fun main()
{

    var mySavingManager = SavingManager()
    try {
        mySavingManager.InitFileManager("savings.txt")
        mySavingManager.Load()
        //mySavingManager.addNewSaving("ház",50000.0,50000000.0)
        //mySavingManager.addNewSaving("Ház",50000.0,15000000.0)
        //mySavingManager.Save()
    }
    catch (exp:Exception)
    {
        println(exp.message)
    }
    for (name in mySavingManager.getSavingsNames())
    {
        println(name)
    }

    //println(testSaving.toString())
}