
public class Person {
	private String name;
	private int age;
	private double salary;

	public Person() {
		super();
		this.name = "";
		this.age = 0;
		this.salary = 0.0;
	}

	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = -1;
	}

	public void displayInfo() {
		System.out.println("Name: " + this.name + ", Age: " + this.age + ", Salary: " + this.salary);
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("John Doe", 21, 180000);

		person1.displayInfo();
		person2.displayInfo();

		Person person3 = new Person("Adam Leon", 38);
		person3.displayInfo();
		if (person3.salary == -1) {
			System.out.println("Salary not provided");
		}
	}
}
