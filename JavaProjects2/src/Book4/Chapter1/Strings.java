package JavaProjects2.src.Book4.Chapter1;

public class Strings {

    public static void main(String[] args) {
        
        int empCount = 50;
String msg = "Number of employees: " + empCount;
System.out.println(msg);
System.out.println("xxxxxxx");
//Length
String s = "A wonderful day for a neighbor.";
int len = s.length();
        System.out.println(len);
        System.out.println("xxxxxxxxx");



//Split
String address = "1500 N. Third Street:Fresno:CA:93722";
String[] parts = address.split(":");

for (int i = 0; i < parts.length; i++)
System.out.println(parts[i]);

    }

}
