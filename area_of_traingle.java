import java.util.Scanner;
public class area_of_triange{
    public static void main(String [] args){
        double base,height;
        System.out.print("Enter the base and height of the triangle in cm");
        base = scanner.nextdouble();
        height = scanner.nextdouble();
        double base_inch = base/2.54;
        double height_inch = height/2.54;
        double area = (1/2) * base * height;
        double area_inch = (1/2) * base_inch * height_inch;
        System.out.println("The area of the triangle is "+ area " cm and in inch is " + area_inch);
        
    }
}