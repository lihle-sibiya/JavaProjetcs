import java.awt.event.*;
import javax.swing.*;
public class TickTock
{
    public static void main(String[] args)
    {
        // create a timer that calls the Ticker class
        // at one second intervals

        Timer t = new Timer(1000, new Ticker()); //interval set to 1,000 milliseconds
        t.start(); //calls the start method to kick the timer into action.
        // display a message box to prevent the
        // program from ending immediately

        JOptionPane.showMessageDialog(null,//display messageBox
            "Click OK to exit program");
    }
}

class Ticker implements ActionListener //Implements ActionListener interface
{//keeps track of whether the Ticker displays Tick... or Tock...
    private boolean tick = true; //when actionPerformed method is called, this field is toggled

    public void actionPerformed(ActionEvent event) //actionPerformed method, called at each timer interval
    {
        if (tick)
        {
            System.out.println("Tick...");//prints Tick
        }
        else
        {
            System.out.println("Tock...");//prints Tock
        }
        tick = !tick; //toggles the value of the tick variable: if tick = True : set to false
    }
}
