import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        System.out.println(checker(x));
    }
         
    public static boolean checker(int x) {
        int result = 0;
        for (int i = 1; i < x; i++) {
            if(x % i == 0) {
                result += i;
            }
        }
        if (x == result) {
            System.out.println( x+ " is a Tuna's number");
            return true;
        }
        else {
            System.out.println( x+ " is not Tuna's number");    
            return false;
        }
    }
}

