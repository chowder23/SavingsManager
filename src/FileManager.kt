import java.io.File

class FileManager
{
    var myFile = File("savings.txt")

    fun saveDataToFile(savings:List<Saving>)
    {
        for (saving in savings)
        {
            myFile.appendText(saving.toSaveFormat()+"\n")
        }
    }
}