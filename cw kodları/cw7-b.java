import java.util.Scanner;
public class Main {
    
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double x = in.nextDouble();
    System.out.print("Enter the second number: ");
    double y = in.nextDouble();
    System.out.print("Enter the third number: ");
    double z = in.nextDouble();
    System.out.print("The sum of these numbers is " + sum(x, y, z)+"\n" );
    System.out.print("The product of these numbers is " + product(x, y, z)+"\n" );
    }
    
    public static double sum(double x, double y, double z) {
        return (x+y+z);
    }
    
     public static double product(double x, double y, double z) {
        return (x*y*z);
    }
}