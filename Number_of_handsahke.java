import java.util.Scanner;
public class Number_of_handshake{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_students;
        System.out.print("Enter the number of students: ");
        number_of_students = scanner.nextInt();
        double Number_of_handshake = (number_of_students*(number_of_students-1)/2);
        System.out.println("Total number of handshake are: "+ Number_of_handshake);

    }
}