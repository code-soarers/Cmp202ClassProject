package UI.Files;

public class Main2 {
//
public static void main(String[] args) {
    FileWriterMain fileWriterMain=new FileWriterMain();
    fileWriterMain.appendData("Appending a text");
    fileWriterMain.readFromFile();
}
}
