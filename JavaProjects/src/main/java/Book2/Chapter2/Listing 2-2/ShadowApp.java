public class ShadowApp
{		
    static int x;	//class variable
    public static void main(String[] args)
    {
        x = 5;	
        System.out.println("x = " + x);
        int x;	//local variable named x is declared - shadows class variable x
        x = 10;	
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = " +
            ShadowApp.x);	//ShadowApp.x refers to the class variable
    }	
}		
