package Book4.Chapter3;

import java.util.*;

public class Chap3 {
    
    public static void main(String[] args) {

        // new ArrayList object
        ArrayList<String> signs = new ArrayList<String>();

        // add method
        signs.add("Drink Pepsi");
        signs.add("No minors allowed");
        signs.add("Say Pepsi, Please");
        signs.add("7-Up: You Like It, It Likes You");
        signs.add("Dr. Pepper 10, 2, 4");

        System.out.println(signs);

        System.out.println("New line                                                          New line ");

        // ADD: listing position
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add(2, "Two and a half");
        System.out.println(nums);

        // Access Elements with get method: specifies index value
        for (int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));

         System.out.println("New line                                                          New line ");

        // enhanced for loop
        for (String s : nums)
            System.out.println(s);

         System.out.println("New line                                                          New line ");

        // indexOf
        for (String s : nums) {
            int i = nums.indexOf(s);
            System.out.println("Item " + i + ": " + s);
        }

         System.out.println("New line                                                          New line ");

        // set method to replace an existing object with another object
        ArrayList<String> nums1 = new ArrayList<String>();
        nums1.clear();
        nums1.add("One");
        nums1.add("Two");
        nums1.add("Three");
        System.out.println(nums1);
        nums1.set(0, "Uno");
        nums1.set(1, "Dos");
        nums1.set(2, "Tres");
        System.out.println(nums1);

         System.out.println("New line                                                          New line ");

        //Deleting Elements
        ArrayList<Employee> emps = new ArrayList<Employee>();
        // create employee objects
        Employee emp1 = new Employee("Addams", "Gomez");
        Employee emp2 = new Employee("Taylor", "Andy");
        Employee emp3 = new Employee("Kirk", "James");
        // add employee objects to array list
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        // print the array list
        System.out.println(emps);

         System.out.println("New line                                                          New line ");
        
        // remove one of the employees
        emps.remove(emp2);
        // print the array list again
        System.out.println(emps);

    }

}


