package Book3.Chapter2;

public class CreatingClasses {
    public static void main(String[] args) {
        Dice d = new Dice();
        d.roll();
    }

    // Inner class
    class Dice {
        public void roll() {
            // code that rolls the dice goes here
        }
    }

    // Public Fields
    public int trajectory = 0;
    public String name;
    public Player player;

    // Private fields
    private int x_position = 0;
    private int y_position = 0;
private String error-message="";

    // public method
    public boolean isActive() {
        return this.isActive;
    }

    // private method
    private void calculateLunarTrajectory() {
        // code to get the calculated lunar trajectory
    }

    // Getters and Setters
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
        health = h;
    }
}