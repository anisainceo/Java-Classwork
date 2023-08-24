import java.util.Scanner;
public class Main {
    
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    float x = in.nextFloat();
    System.out.print("Enter the second number: ");
    float y = in.nextFloat();
    System.out.print("The product of these numbers is " + product(x, y)+"\n" );
    }
    
    public static float product(float x, float y) {
        return (x*y);
    }
}