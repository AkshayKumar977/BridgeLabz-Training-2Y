import java.util.Scanner;
public class distance_to_miles{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    double km;
    System.out.print("Enter the distance in km: ");
    km = scanner.nextdouble();
    double miles = km / 1.6;
    System.out.println("The total miles is " + miles + " mile for the given " + km );    }
}