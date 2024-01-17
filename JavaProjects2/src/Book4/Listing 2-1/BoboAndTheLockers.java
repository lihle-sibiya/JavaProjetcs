public class BoboAndTheLockers
{
   public static void main(String[] args)
   {
      // true = open; false = closed
      boolean[] lockers = new boolean[1001]; //array of booleans with 1,001 elements	
      
     // close all the lockers
     for (int i = 1; i <= 1000; i++) 	
         lockers[i] = false;
      
         for (int skip = 1; skip <= 1000; skip++)	//Skip = how many lockers Bobo skips on each trip
      {
         System.out.println("Bobo is changing every "
             + skip + " lockers.");
         for (int locker = skip; locker < 1000;	// // Bobo is changing every "skip" lockers
                 locker += skip)//adds the skip variable to the index variable so Bobo can access every nth locker
             lockers[locker] = !lockers[locker];	//(!) to reverse locker setting. If locker is open (true), it’s set to closed (false
      }
      System.out.println("Bobo is bored" 
         + " now so he's going home.");

         
      // count and list the open lockers
      String list = "";
      int openCount = 0;
      for (int i = 1; i <= 1000; i++)	
         if (lockers[i])
         {
             openCount++;
             list += i + " ";
         }
      System.out.println("Bobo left " + openCount
         + " lockers open.");
      System.out.println("The open lockers are: " 
         + list);
   }
}
