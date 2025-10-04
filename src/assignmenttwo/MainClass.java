package assignmenttwo;

public class MainClass {
    public static void main(String[] args) {
        // Demonstrating Student class
        Student s = new Student();

        // Demonstrating Commission class
        Commision emp = new Commision();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}