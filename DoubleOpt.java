import java.util.Scanner;
public class DoubleOpt{
    public static void main(String [] args){
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        c = scanner.nextInt();
        double op1 = (a + b)*c;
        double op2 = (a*b) + c;
        double op3 = c + (a/b);
        System.out.println("THe results of Int Operations are "+ op1 + "," + op2 + ","+op3); 
    }
}