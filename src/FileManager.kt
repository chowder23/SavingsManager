import java.io.File

class FileManager
{
    var myFile = File("savings.txt")

    fun saveDataToFile(savingsStrings:List<String>)
    {
        for (savingString in savingsStrings)
        {
            myFile.appendText("$savingString\n")
        }
    }

    fun loadDataFromFile():List<String>
    {
        var savingsStrings = mutableListOf<String>()
        for (line in myFile.readLines())
        {
            savingsStrings.add(line)
        }
        return savingsStrings
    }
}