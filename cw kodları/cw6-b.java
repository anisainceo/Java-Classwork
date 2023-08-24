import java.util.Scanner;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Heads or Tails ");
        int x = input.nextInt();
        
        double a = Math.random() * 1;
        if (Math.random() >= 0.5 && x == 1)
        {
            System.out.println("You won");
        }
        else
        {
            System.out.println("You lost");
        }
        
    }
}