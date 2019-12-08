package PreviousReplHomwork;

public class Main147 {

	public static void main(String[] args) {
		Person p1 = new Person();
		z p2 = new z();
		p2.emp("Joe", "Smith", 35, 35000);
		Student p3 = new Student();
		p3.Student("Adam", "Smith", 15, 10);
		Retiree p4 = new Retiree();
		p4.ret("Frank", "Smith", 15, "tour");
	}
}

class Person {
	public Person() {
	}

	String name;
	String lastName;
	int age;

	public Person(String name, String lastName, int age) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

}

class z {
	int salary;

	public void emp(String name, String lastName, int age, int salary) {
		this.salary = salary;
		System.out.println(name + " " + lastName + " " + age + " " + salary);
	}

}

class Student extends Person {
	int grade;

	public void Student(String name, String lastName, int age, int grade) {
		this.grade = grade;
		System.out.println(name + " " + lastName + " " + age + " " + grade);
	}

}

class Retiree extends Person {
	String seniorActivity;

	public void ret(String name, String lastName, int age, String seniorActivity) {
		this.seniorActivity = seniorActivity;
		System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);

	}

}