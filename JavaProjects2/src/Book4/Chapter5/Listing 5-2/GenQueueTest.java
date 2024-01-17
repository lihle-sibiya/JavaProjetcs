public class GenQueueTest { //Generic que: capable of holding objects of any specified type
    public static void main(String[] args) {

        GenQueue<Employee> empList; //GenQueue object that can hold Employee objects
        empList = new GenQueue<Employee>(); //queue is assigned to a variable named empList

        GenQueue<HourlyEmployee> hList; //another GenQueue object: HourlyEmployee objects (a subclass of Employee)
        hList = new GenQueue<HourlyEmployee>(); //assigned to a variable named hList

        //three rookie employees are created and added to the hList queue.
        hList.enqueue(new HourlyEmployee(
                "Trump", "Donald"));
        hList.enqueue(new HourlyEmployee(
                "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Forbes", "Steve"));
           
       //addItems method of the empList queue is then called to transfer these employees
       //from the hList queue to the empList queue 
       empList.addItems(hList);
       //While loop is used to print the employees that are now in the empList que
        while (empList.hasItems()) {
            Employee emp = empList.dequeue();//etrieves the first itemr from the queue.
            System.out.println(emp.firstName
                    + " " + emp.lastName);
        }
    }
}

class Employee {
    public String lastName;
    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}

class HourlyEmployee extends Employee {
    public double hourlyRate;

    public HourlyEmployee(String last, String first) {
        super(last, first);
    }
}
