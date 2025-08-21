import java.util.Scanner;
public class total_price{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double unitprice;
        double quantity;
        System.out.print("Enter the unit price of the product: ");
        unitprice = scanner.nextDouble();
        quantity = scanner.nextDouble();
        double total_price = unitprice * quantity;
        System.out.println("The total purchase price is INR " + total_price + " if the quantity " + quantity + " and the unit price is INR " + unitprice);
        

        
    }
}