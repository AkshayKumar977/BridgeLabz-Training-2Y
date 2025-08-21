import java.util.Scanner;
public class area_of_triangle{
    public static void main(String [] args){
        double height,base;
        System.out.print("Enter base and height of the triangle in cm : ");
        Scanner scanner= new Scanner(System.in);
        base = scanner.nextDouble();
        height = scanner.nextDouble();
        double area = 0.5 * base * height;
        double inch_height = height/2.54;
        double inch_base = base / 2.54;
        double area_inch = 0.5 * inch_height * inch_base;
        System.out.println("The Area of the triangle in sq in is " + area_inch + " and sq cm is " + area);
    }
    
        
}