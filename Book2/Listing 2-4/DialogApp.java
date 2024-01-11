import javax.swing.JOptionPane;	
public class DialogApp
{
    public static void main(String[] args)
    {
        String s;
        s = JOptionPane.showInputDialog	//JOptionPane class is a part of the javax.swing package
                ("Enter an integer:");	
        int x = Integer.parseInt(s);	//convert the string  to an integer.
        System.out.println("You entered " + x + ".");
    }
}
