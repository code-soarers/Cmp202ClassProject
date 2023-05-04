// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.InputMismatchException;
import java.util.Scanner;
class Main{

    public static void main(String[] args) {
        Geometry geometry=new Geometry();
        Scanner input=new Scanner(System.in);
        try{
            float length = input.nextFloat();
            float breadth = input.nextFloat();

            System.out.println(geometry.areaOfTriangle(length, breadth));

        }
        catch(InputMismatchException ime){
            System.out.println("Enter a valid number");
        }

        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }

}