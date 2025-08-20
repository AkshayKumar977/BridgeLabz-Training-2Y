import java.util.Scanner;
public class distance_in_yards{
    public static void main(String [] args){
        double distance;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        distance = scanner.nextdouble();
        double distance_yards = distance/3;
        double distance_mile = distance_yards/1760;
        System.out.println("The distance in yards " + distance_yards + "and in miles is " + distance_mile);
    }
}