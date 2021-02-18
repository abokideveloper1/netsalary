package entities;

public class employee {
	
	private String name;
	private String department;
	private Float salary;
	
	public employee(String name, String department, Float salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
	
	
}