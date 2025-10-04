package assignmentone.employees;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name2, int employeeId2, double salary2) {
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    protected void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}