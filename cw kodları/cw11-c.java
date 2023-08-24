import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int num = in.nextInt();
        int[] myAr = {1,2,3,4,5};
        if(hasItem(num, myAr))
        System.out.println("Includes");
        else 
        System.out.println("Does not include");
    }
    public static boolean hasItem(int num, int[] myAr) {
        boolean result = false;
        for(int i = 0; i < 5; i++) {
            if (num == myAr[i]) {
                result = true;
                break;
            }
        }
    return result;
    }
}