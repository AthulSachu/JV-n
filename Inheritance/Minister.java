public class Minister extends Designation {

	public Minister(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void printDetails() {
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Salary is: "+salary);
	}

}