package task.treesetemployee;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		SortedSet<Employee> employees = new TreeSet<>();
		employees.add(new Employee("Mihai", 222));
		employees.add(new Employee("Ionut", 225));
		employees.add(new Employee("Virgil", 230));
		employees.add(new Employee("Mihnea", 233));
		
		System.out.println("Sorted employees: ");
		System.out.println(employees);
		
		employees = new TreeSet<>(Comparator.comparing(Employee::getName));
		employees.add(new Employee("Mihai", 222));
		employees.add(new Employee("Ionut", 225));
		employees.add(new Employee("Virgil", 230));
		employees.add(new Employee("Mihnea", 233));
		
		System.out.println();
		System.out.println("Sorted employees(name): ");
		System.out.println(employees);
		
		TreeSet<String> name1 = new TreeSet<>();
		
		name1.add("Mihai");
		name1.add("Ionut");
		name1.add("Virgil");
		name1.add("Mihnea");
		
		boolean isRemoved = name1.remove("Mihai");
			if(isRemoved) {
			System.out.println();
			System.out.println("Removing Mihai:");
			System.out.println("Employee: " + name1);
			}
		}
}
