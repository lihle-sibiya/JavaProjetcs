public class DiceApp
{
    public static void main(String[] args)
    {
        int roll;
        String msg = "Here are 100 random rolls of the dice:";
        System.out.println(msg);
        for (int i=0; i<100; i++)	
        {
            roll = randomInt(1, 6);	
            System.out.print(roll + " ");	//print method: random numbers printed on same  line
        }
        System.out.println();
    }
    public static int randomInt(int low, int high)	
    {
        int result = (int)(Math.random()	//converts the random double value to an integer
            * (high - low + 1)) + low; //between low and high.
        return result;	
    }

}
