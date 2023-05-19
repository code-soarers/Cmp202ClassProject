package UI.Files;

import java.io.*;
import java.util.Scanner;

public class FileWriterMain {
    public void writeData(String data){
        try{
            //the file
            File myFile = new File("myFile.txt");

            //where to write the file to
            FileWriter writeToFile = new FileWriter(myFile);

            //method to write to the above
            writeToFile.write(data);
            writeToFile.append("More Text");

            //close of the file
            writeToFile.flush();
            writeToFile.close();
        }
        catch(IOException ioException){
            System.out.println("Can not write to this file");
        }
    }
    public void readFromFile() {
        try {
            File myFile = new File("test.txt");
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNext()){
                String dataInFile = myReader.nextLine();
                System.out.println(dataInFile);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("file does not exist");

        }
    }

    public void appendData(String data)  {
        try {
            File newFile=new File("test.txt");
            FileWriter fileWriter=new FileWriter(newFile,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            PrintWriter printWriter=new PrintWriter(bufferedWriter);

            printWriter.println(data);

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (IOException ioException){
            System.out.println("ERROR OCCURED");
        }
    }
}
