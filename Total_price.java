import java.util.Scanner;
public class Total_price{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double unitprice;
        int quantity;
        System.out.print("Enter the unit price and the quantity: ");
        unitprice = scanner.nextdouble();
        quantity = scanner.nextInt();
        double price = unitprice * quantity;
        System.out.println("The total price is INR " + price + "if the quantity " + quantity + " and the unit price is INR " + quantity);
    }
}