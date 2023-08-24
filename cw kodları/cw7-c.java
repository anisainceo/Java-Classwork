import java.util.Scanner;
public class Main {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one input: ");
        int x = in.nextInt();
        divisor(x);
    }
    
    public static void divisor(int inputNum) {
        if (inputNum %2 == 0) {
            System.out.println("2 is the smallest one digit divisor");
        }
        else if (inputNum %3 == 0) {
            System.out.println("3 is the smallest one digit divisor");
        }
        else if (inputNum %5 == 0) {
            System.out.println("5 is the smallest one digit divisor");
        }
        else if (inputNum %7 == 0) {
            System.out.println("7 is the smallest one digit divisor");
        }
        else {
            System.out.println("There is no one digit divisor");
        }
    }  
}
