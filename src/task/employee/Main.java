package task.employee;

public class Main {

	public static void main(String[] args) {

		Employee employee1 = new Employee(12, "Hon", "Ika", 11000);
		Employee employee2 = new Employee(13, "Poke", "Lina", 10000);
		
		employee1.setPercent(30);
		employee2.setPercent(50);

		System.out.println(employee1);
		System.out.println(employee2);
	}
}
