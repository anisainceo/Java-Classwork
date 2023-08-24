import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 integer: ");
        int num = input.nextInt();
        if (num%2 == 0)
        {
            System.out.println("The smallest divisor " + num + " is two");
        }
        else if (num%3 == 0)
        {
            System.out.println("The smallest divisor " + num + " is three");
        }
        else if (num%4 == 0)
        {
            System.out.println("The smallest divisor " + num + " is four");
        }
        else if (num%5 == 0)
        {
            System.out.println("The smallest divisor " + num + " is five");
        }
        else if (num%6 == 0)
        {
            System.out.println("The smallest divisor " + num + " is six");
        }
        else if (num%7 == 0)
        {
            System.out.println("The smallest divisor " + num + " is seven");
        }
        else if (num%8 == 0)
        {
            System.out.println("The smallest divisor " + num + " is eight");
        }
        else if (num%9 == 0)
        {
            System.out.println("The smallest divisor " + num + " is nine");
        }
        else 
        {
            System.out.println( + num + " No divisor! ");
        }
    }
}