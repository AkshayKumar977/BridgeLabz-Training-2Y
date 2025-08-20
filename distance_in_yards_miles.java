import java.util.Scanner;
public class area_in_yards_miles{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double perimeter;
        System.out.print("Enter the perimeter of the Square: ");
        perimeter = scanner.nextdouble();
        double side = perimeter/4;
        System.out.println("The lenght of the side is " + side + " whose perimeter is " + perimeter);
        
    }
}