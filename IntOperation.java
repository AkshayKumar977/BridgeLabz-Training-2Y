import java.util.Scanner;
public class IntOperation{
    public static void main(String [] args){
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        c = scanner.nextInt();
        int op1 = (a + b)*c;
        int op2 = (a*b) + c;
        int op3 = c + (a/b);
        System.out.println("THe results of Int Operations are "+ op1 + "," + op2 + ","+op3); 
    }
}