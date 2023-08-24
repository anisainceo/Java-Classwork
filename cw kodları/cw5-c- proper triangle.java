import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the sides of triangle:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if (a <= 0 || b <= 0 || c <= 0) 
        {
            System.out.println("The input number is negative.");
        }
        else if ( a - b <= c && a + b >= c)
        {
            System.out.println("This is a proper triangle");
        }
        else if ( a - c <= b && a + c >= b)
        {
            System.out.println("This is a proper triangle");
        }
        else if ( c - b <= a && c + b >= a)
        {
            System.out.println("This is a proper triangle");
        }
        else 
        {
        System.out.println("This is a NOT proper triangle");
        }
    }
}