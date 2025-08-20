import java.util.Scanner;
public class Calculator{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    double number1,number2;
    System.out.print("Enter the two numbers: ");
    number1 = scanner.nextfloat();
    number2 = scanner.nextfloat();
    double addition = number1 + number2;
    double subtraction = number1 - number2;
    double multiplication = number2 * number2;
    double division = number1 / number2;
    System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + number1 + "and " + number2 + "is " + addition + "," + subtraction + "," + multiplication + ","  + division);
    }
}