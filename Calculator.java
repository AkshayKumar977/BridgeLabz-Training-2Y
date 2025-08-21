import java.util.Scanner;
public class Q1{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    int number1,number2;
    System.out.print("Enter the two numbers: ")
    number1 = scanner.nextInt();
    number2 = scanner.nextInt();
    int addition = number1 + number2;
    int subtraction = number1 - number2;
    int multiplication = number1 * number2;
    int division = number1 / number2;
    System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ',' + subtraction + ',' + multiplication + ', and ' + division);
    }
}