public class ScopeApp
{		
    static int x; //class variable
    public static void main(String[] args)
    {
        x = 5;
        System.out.println("main: x = " + x);
        myMethod();
    }
    public static void myMethod()
    {
        int y; //local variable
        y = 10;	 //initialized
        if (y == x + 5)	//if statement
        {
            int z;
            z = 15;	
            System.out.println("myMethod: z = " + z);
        }	
        System.out.println("myMethod: x = " + x);
        System.out.println("myMethod: y = " + y);
    }	
}		
