import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the destination number: ");
        int num2 = in.nextInt();
        System.out.println("Enter the incrementation value: ");
        int num3 = in.nextInt();
        System.out.println(total(num1, num2, num3)); 
    }
    
    public static int total( int num1, int num2, int num3) {
        int result = 0;
        if (num1 > num2) {
            int a = num1;
            num1 = num2;
            num2 = a;
        }
        for (int i = num1; i <= num2; i += num3) {
            result += i;
        }
        return result;
    }
}