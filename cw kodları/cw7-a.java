 import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double x = in.nextDouble();
    System.out.print("Enter the second number: ");
    double y = in.nextDouble();
    System.out.print("The min value is " + min(x, y)+"\n" );
    System.out.print("The max value is " + max(x, y)+"\n" );
    }

    public static double max(double num1, double num2) {
        double result;
        if (num1>num2)
        result = num1;
        else
        result = num2;
        return result;
    }

    public static double min(double num1, double num2) {
        double result;
        if (num1<num2)
        result = num1;
        else
        result = num2;
        return result;
     }
}