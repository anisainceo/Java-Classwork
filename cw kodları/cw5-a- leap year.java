import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many days in year?");
        int x = input.nextInt();
        if ( x %400 == 0)
        {
            System.out.println("Leap year");
        }
        else if ( x %100 == 0)
        {
            System.out.println("Leap year");
        }
        else if ( x %4 == 0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("Not a Leap year");
        }
    }
}