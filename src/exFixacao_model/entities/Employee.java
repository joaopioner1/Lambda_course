package exFixacao_model.entities;

public class Employee {
	
	private final String name;
	private String email;
	private Double salary;
	
	public Employee() {
		this.name = "";
	}
	
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, String email, Double salary) {
		this(name, salary);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("\nName: %s\nEmail: "
				+ "%s\nSalary: %.2f", getName(), getEmail(), getSalary());
	}
}
