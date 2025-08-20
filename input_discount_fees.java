import java.util.Scanner;
public class input_discount_fees{
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    double fees;
    double discount;
    System.out.print("Enter the fees: ");
    fees = scanner.nextdouble();
    double discount_fees = fees * (discount)/100; 
    double total_fees = fees - discount_fees;
    System.out.println("The discount amount is INR " + discount_fees + " and final discounted fee is INR " + total_fees);
    }
}