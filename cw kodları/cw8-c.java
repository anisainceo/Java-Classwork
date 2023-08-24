import java.util.Scanner;
public class Main {
    
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
	        System.out.println("Enter the first number: " );
	        int x = in.nextInt();
	        System.out.println("Enter the second number: " );
	        int y = in.nextInt();
	        System.out.println("The sum of the numbers between these two numbers is " + result(x,y) + "\n" );
	}
	
	public static int result(int x, int y) {
	    int sum = 0;
	    int count = x;
	    while (count <= y) {
	        sum = sum + count;
	        count++;
	    }
	    return sum;
	}
}
