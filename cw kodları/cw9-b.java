import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int x = in.nextInt();
        System.out.println(digitSum2(x));
    }
    public static int digitSum(int x) {
        int sum = 0;
        while(x > 0) {
            sum = sum + x % 10;
            x = x /10;
        }
        return sum;
    }
    
    public static int digitSum2(int x) {
        int sum1 = 0;
        for (int i =1; x > 0; x = x / 10) {
            sum1 = sum1 + x % 10;
        }
        return sum1;
    }
    
}

