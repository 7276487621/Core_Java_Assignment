import java.util.Scanner;

//49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method 
//calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax
//on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate 
//salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee 
//information and a product information from user and print income tax and sales tax respectively.



interface Taxable{
	double salesTax = 0.07;
	double incomeTax =0.105;
	void calcTax();
	
}
class Employee implements Taxable{
	int empId;
	String name;
	int salary;
	
	public Employee(int empId, int salary , String name) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public void calcTax() {
	double tax = salary*incomeTax;
	System.out.println("tax = "+tax);
		
	}
	
}
class Product implements Taxable{
	int pid,price,quantity;

	public Product(int pid, int price, int quantity) {
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public void calcTax() {
		int t = price * quantity;
		double tax = t * salesTax;
		double total = tax + t;
		double unit = total/quantity;
		System.out.println("total sale tax = "+tax);
		System.out.println("unit price on product = "+unit);
		
	}
	
	
}


public class Q49 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Details :");
		System.out.print("Employee ID : ");
		int eid = sc.nextInt();
		System.out.print("Enter the Employee Salary :");
		int sal = sc.nextInt();
		System.out.print("Enter the Employee Name : ");
		String name = sc.next();
		
		Taxable e = new Employee(eid,sal,name);
		e.calcTax();
		
		System.out.println("Enter the Product details : ");
		System.out.print("Enter the product Id : ");
		int pid = sc.nextInt();
		System.out.println("Enter the price of the product : ");
		int price = sc.nextInt();
		System.out.println("Enter the Quatity of Product :");
		int q = sc.nextInt();
		
		Taxable p = new Product(pid,price,q);
		p.calcTax();


	}

}