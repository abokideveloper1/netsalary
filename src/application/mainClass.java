package application;
import java.util.Scanner;
import entities.employee;

public class mainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter employee department: ");
		String department = input.nextLine();
		System.out.print("Enter basic salary of employee: ");
		Float salary = input.nextFloat();
		
		float allowance = (30 / 100) * salary;
		float grosstax = (float) ((0.25 / 100) * salary);
		float tax = salary - grosstax;
		
		System.out.println(" ");
		System.out.println("Employee's name: "+name);
		System.out.println(" ");
		System.out.println("Employee's department: "+department);
		System.out.println(" ");
		System.out.println("Employee's salary: "+salary);

	}

}
