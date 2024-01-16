import java.awt.event.*;
import javax.swing.*;
public class TickTockAnonymous
{
   private String tickMessage = "Tick . . .";
   private String tockMessage = "Tock . . .";


   public static void main(String[] args)	
   { //Anonymous classes won’t work in a static context so create ...
      TickTockAnonymous t = new TickTockAnonymous(); //instance of the TickTockAnonymous class
      t.go();
   }

   private void go() //this method can freely access fields defined in outer class
   {
      // create a timer that calls the Ticker class
      // at one second intervals
      Timer t = new Timer(1000,	//object that implements the ActionListener interface
         new ActionListener()	
         {	//anonymous class begins
             private boolean tick = true;

             public void actionPerformed(//actionPerformed method is called every 1,000 milliseconds by timer
                 ActionEvent event)
             {
                 if (tick)
                 {
                     System.out.println(tickMessage);
                 }
                 else
                 {
                     System.out.println(tockMessage);
                 }
                 tick = !tick;
             }
         } );	

      t.start();
      // display a message box to prevent the
      // program from ending immediately
      JOptionPane.showMessageDialog(null, 
         "Click OK to exit program");
      System.exit(0);
   }
}
