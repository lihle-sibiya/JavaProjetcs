public class TestEquality2
{
   public static void main(String[] args)
   {
      Employee emp1 = new Employee(	
         "Martinez", "Anthony");
      Employee emp2 = new Employee(	
         "Martinez", "Anthony");
      if (emp1.equals(emp2))//Compares the two Employee objects - equals method	
         System.out.println(
             "These employees are the same.");
      else
         System.out.println(
             "These are different employees.");
   }
}

class Employee	
{
   private String lastName;
   private String firstName;

   public Employee(String lastName, String firstName)
   {
      this.lastName = lastName;
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   public String getFirstName()
   {
      return this.firstName;
   }

   public boolean equals(Object obj)	//overridden equals method
   {
      // an object must equal itself
      if (this == obj)	//Returns true if the same object instances are being compared
         return true;

      // no object equals null
      if (this == null)	//Returns false if the object being compared is null.
         return false;

      // objects of different types are never equal
      if (this.getClass() != obj.getClass())	
         return false;

      // cast to an Employee, then compare the fields
      Employee emp = (Employee) obj;	
      return this.lastName.equals(emp.getLastName())	
        && this.firstName.equals(emp.getFirstName());
   }
}
