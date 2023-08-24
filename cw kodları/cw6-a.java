import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1 and number2: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double result = Math.pow(num1,num2);
        System.out.print( num1 + " to the power " + num2 + " is equal to " + result );
    }
}