import java.util.Scanner;
public class Main 
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your firstname: ");
        String fname = in.next();
        System.out.println("Enter your surname: ");
        String sname = in.next();
        fname = fname.trim();
        sname = sname.trim();
        String fullname = fname + sname;
        fullname = fullname.toUpperCase();
        int length = fullname.length();
        char first = fullname.charAt(0);
        char last = fullname.charAt(length - 1);
        
        System.out.println("Full name: " + fullname);
        System.out.println("First Char: " + first);
        System.out.println("Last char: " + last);
        System.out.println("Length: " + length);
    }
}