// //Protecting Your Members
// public class Ball {
//     private double weight;

//     protected double getWeight() {// declared with protected access
//         return this.weight;
//     }
//     protected void setWeight(double weight) {// declared with protected access
//         this.weight = weight;
//     }
// }
// public class BaseBall extends Ball {
//     public BaseBall() {
//         setWeight(5.125);
//     }
// }
// Inheritance and Constructors
public class Ball {

    private double weight;

    public Ball(double weight) {
        this.weight = weight;
    }
}

//public class BaseBall extends Ball {
//
//    public BaseBall() {
//        super(5.125);// sets weight using super keyword to invoke constructor of superclass Ball
//    }
//}

//// Using final - method that can’t be overridden by a subclass
//public class SpaceShip {
//
//    public final int getVelocity() {// declare method getVelocity
//        return this.velocity;
//    }
//}
//
//// Final Class - that can’t be used as a base class
//public final class BaseBall { //declare class Baseball as final and cant be extended
//
//}

//Object Type - Using instanceof operator
//Employee emp = getEmployee();
//String msg;
//if (emp instanceof SalariedEmployee)//check Employee object using instanceof operator
//{
//msg = "The employee's salary is ";
//msg += ((SalariedEmployee) emp).getFormattedSalary(); 
//}
//else
//{
//msg = "The employee's hourly rate is ";
//msg += ((HourlyEmployee) emp).getFormattedRate();
//}
//System.out.println(msg);
