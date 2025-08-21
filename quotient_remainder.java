import java.util.Scanner;
public class quotient_remainder{
    public static void main(String [] args){
        int number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();
        double quotient = number1/number2;
        double remainder = number1%number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder+ " of two number " + number1 + " and " + number2);
        

    }
}