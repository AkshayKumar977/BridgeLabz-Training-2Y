import java.util.Scanner;
public class height_conversion{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    double height;
    System.out.print("Enter the height in cm");
    height = scanner.nextdouble();
    double height_inch = height/2.54;
    double height_foot = height_inch/12;
    System.out.println("Your Height in cm is " + height + " while in feet is " + height_foot + " and inches is " + height_inch);
    }
}