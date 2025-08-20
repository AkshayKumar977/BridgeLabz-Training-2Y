public class Dividing_pen{
    public static void main(String [] args){
        int pens = 14;
        int students = 3;
        int remaining = pens % students;
        int distribution = (pens - remaining) / students;
        System.out.println("The Pen per Student is " + distribution + " and the remaining pen not distributed is " + remaining);
        
    }
}