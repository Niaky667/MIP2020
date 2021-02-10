package task.treesetemployee;
import java.util.*;

public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
			return id == employee.id;
	}

	public int compareTo(Employee employee) {
		return this.getId() - employee.getId();
	}

	@Override
	public String toString() {
		return "Employee: " + name + ", " + id;
	}
}
