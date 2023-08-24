import java.util.Scanner;
public class Main {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int myArray[] = new int [5];
      System.out.println("Enter the elements of the array: ");
      int sum = 0;
      for(int i = 0; i < 5; i++){
         myArray[i] = in.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Sum of the elements of the array: "+sum);
   }
}