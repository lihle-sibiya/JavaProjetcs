import java.util.Scanner;	
public class ScannerApp
{
    static Scanner sc = new Scanner(System.in); //input stream
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();	//Reads an int value
        System.out.println("You entered " + x + ".");
    }
}
