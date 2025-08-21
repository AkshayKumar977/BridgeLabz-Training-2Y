import java.util.Scanner;
public class distance_in_yards{
    public static void main(String [] args){
        double distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        distance = scanner.nextDouble();
        double yards = distance/3;
        double miles = yards/1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
    }
}