import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Please enter a value: ");
        int num = in.nextInt();
        System.out.println("Product from 1 to " +num+ " is " +whileloop(num));
    }
    
    public static int whileloop(int num) {
        int i = 1;
        int total = 1;
        if(num == 0)
        total = 1;
        else {
            while(i <= num) {
                total = total * i;
                i++;
            }
        }
        return total;
    }
    
    public static int forLoop(int num) {
        int i = 1;
        int total = 1;
        if(total == 0)
        total = 1;
        else {
            for(i = 1; i <= num; i++) {
                total = total * i;
            }
        }
        return total;
    }
}