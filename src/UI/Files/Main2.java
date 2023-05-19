package UI.Files;

public class Main2 {
//
public static void main(String[] args) {
    FileWriterMain fileWriterMain=new FileWriterMain();
    fileWriterMain.readFromFile();
   fileWriterMain.appendData("An example of an appended data");
}
}
