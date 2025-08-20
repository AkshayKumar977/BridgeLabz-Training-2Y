public class Discount_fees{
    public static void main(String [] args){
        double fees = 125000;
        double discount = 0.1;
        double discount_fees = 125000*0.1;
        double total_fees = fees - discount_fees;
        Ssytem.out.println("The discount amount is INR " + discount_fees + " and final discounted fee is INR "+ total_fees);
        
        }
}