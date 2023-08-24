import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input two float numbers:");
        Float x = input.nextFloat();
        Float y = input.nextFloat();
        
        if ( (int) (x * 1000) == (int) (y *1000))
        {
            System.out.println("They are the same.");
        }
        else 
        {
            System.out.println("They are different.");
        }
    }
}