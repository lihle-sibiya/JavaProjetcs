/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book4.Chapter3;

/**
 *
 * @author Lihle
 */
class Employee {

   private String firstName;
    private String lastName;

    Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    
}
    
      @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
