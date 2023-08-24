import java.util.Scanner;
public class Main {
    static boolean checkForPrime(int inputN) {
        boolean isItPrime = true;
        if(inputN <= 1) {
            isItPrime = false;
            return isItPrime;
            
        }
        else {
            for (int i = 2; i<= inputN/2; i++) {
                if ((inputN % i) == 0) {
                    isItPrime = false;
                    break;
                    
                }
                
            }
            return isItPrime;
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int inputN = sc.nextInt();
        boolean isItPrime = checkForPrime(inputN);
        if (isItPrime) {
            System.out.println(inputN+" is a prime number.");
            
        }
        else {
            System.out.println(inputN+" is not a prime number.");
            
        }
    sc.close();
        
    }
}

