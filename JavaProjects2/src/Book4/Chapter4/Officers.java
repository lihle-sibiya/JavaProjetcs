package Book4.Chapter4;

import java.util.*; //import 

public class Officers {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> officers = new LinkedList<String>();
        // Adding Items
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");

        for (String s : officers)
            System.out.println(s);

        System.out
                .println("Use   addFirst method                                               use   addFirst method ");
        // addFirst method adds items to the front of the list in reverse order
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");
        officers.addFirst("McIntyre");

        for (String s : officers)
            System.out.println(s);

        System.out
                .println("Add: specifiy the index                                        Add: specifiy the index    ");

        // Add: specifiy the index
               officers.add(2, "Tuttle");
        for (String s : officers)
            System.out.println(s);

        System.out.println("   Updating items                                    Updating items    ");

        // Updating LinkedList Items
        // add the original officers
       
        System.out.println(officers);
        // replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced:");
        System.out.println(officers);

        
        // Removing LinkedList Items
        // specifying index number
        officers.remove(3);
        System.out.println(officers);
        // reference to the item
        officers.remove("Blake");
        System.out.println(officers);

    }

}
