import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dividing number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the divisor number: ");
        int num2 = in.nextInt();
        System.out.println(num1+ " % " + num2 + " = " + remainop(num1, num2));
    }
    
    public static int remainop(int num1, int num2) {
        return (num1 - num2 * (num1 / num2));
    }
}