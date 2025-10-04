package assignmentone.utilities;



/**
 * Provides utility methods for Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Prints the details of an employee.
     * Demonstrates usage of public getters.
     */
    public static void printEmployeeDetails(assignmentone.employees.Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    /**
     * Gives a raise to an employee by percentage.
     * Demonstrates modification through public setters.
     */
    public static void giveRaise(assignmentone.employees.Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " has received a " + percent + "% raise. New Salary: " + emp.getSalary());
    }
}