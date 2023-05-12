package UI.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public void writeData(String data){
        try{
            //the file
            File myFile = new File("test.txt");

            //where to write the file to
            FileWriter writeToFile = new FileWriter("myFile.txt");

            //method to write to the above
            writeToFile.write(data);

            //close of the file
            writeToFile.flush();
            writeToFile.close();
        }
        catch(IOException ioException){
            System.out.println("Can not write to this file");
        }
    }
}
