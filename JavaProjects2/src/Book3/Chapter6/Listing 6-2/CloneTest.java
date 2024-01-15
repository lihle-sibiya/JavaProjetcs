public class CloneTest
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee(	
            "Martinez", "Anthony");
        emp1.setSalary(40000.0);	
        Employee emp2 = (Employee)emp1.clone();//creates clone for object Martinez
        emp1.setLastName("Smith");	
        System.out.println(emp1);	
        System.out.println(emp2);	
    }
}

class Employee	
{
    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName, 
                    String firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public Double getSalary()
    {
        return this.salary;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public Object clone()	//Overrides the clone method. return type is Object, not Employee
    {
        Employee emp;
        emp = new Employee(	//Ceates a new Employee object,
            this.lastName, this.firstName); //using last name and first name from current object
        emp.setSalary(this.salary);	//Sets the new employee’s salary to the current object’s salary.
        return emp;	//Returns the cloned Employee object.
    }

    public String toString()
    {
        return this.getClass().getName() + "["
            + this.firstName + " "
            + this.lastName + ", "
            + this.salary + "]";
    }
}
