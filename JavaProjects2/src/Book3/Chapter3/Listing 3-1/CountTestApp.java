public class CountTestApp
{
    public static void main(String[] args)
    {
        printCount();
        for (int i = 0; i < 10; i++) //create 10 instances of the class
        {
            CountTest c1 = new CountTest();//creates an instance of the CountTest class
            printCount();
        }
    }

    private static void printCount() //Prints number of CountTest objects created
    {
        System.out.println("There are now "
            + CountTest.getInstanceCount()
            + " instances of the CountTest class.");
    }
}

class CountTest //keeps track of how many times its constructor has been called
{
    private static int instanceCount = 0;//Stores instance cout. Reset to zero each time the each time app is run

    public CountTest() //Constructor for the CountTest class
    {
        instanceCount++; //instanceCount variable is incremented
    }
    public static int getInstanceCount()
    {
        return instanceCount; //returns the value of static instanceCount field
    }
}
