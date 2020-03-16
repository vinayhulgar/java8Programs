
import java.util.ArrayList;
import java.util.List;

public class EmployeeAgeDemo {

	static class Employee{
		private String name;
		private int age;
		Employee(String name, int age){
			this.name = name;
			this.age = age;
		}
		int getAge() {
			return age;
		}
		@Override
		public String toString() {
			return name+": "+age;
		}
	}
	
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("John", 23));
		employees.add(new Employee("Sally", 29));
		employees.add(new Employee("David", 34));
		employees.add(new Employee("Bob", 44));
		employees.add(new Employee("Gary", 51));
		printEmployee1(employees, 50);
		System.out.println();
		printEmployee2(employees, 60);
	}

	private static void printEmployee2(List<Employee> employees, int age) {
		employees.stream()
		.filter(emp -> emp.age < age)
		.forEach(emp -> System.out.println(emp));
	}

	private static void printEmployee1(List<Employee> employees, int age) {
		for(Employee emp: employees) {
			if(emp.age<age)
				System.out.println(emp);
		}
	}
}
