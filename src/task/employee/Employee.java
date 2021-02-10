package task.employee;

public class Employee {

	private int iD;
	private String firstName;
	private String lastName;
	private int salary;
	private int percent;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public Employee(int iD, String firstName, String lastName, int salary) {
		super();
		this.iD = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}

	public int raiseSalary(int percent) {
		 salary +=  (salary*percent) /100;
			return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + iD + ", First Name = " + firstName + ", Last Name = " + lastName + ", Salary = " + salary
				+ ", Annual Salary = " + getAnnualSalary();
	}
}
