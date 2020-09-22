import java.util.Scanner;
class StudentDemo{
	private int Roll;
	private String Name;
	
	void setdata(int a,String name) {
		Roll=a;
		Name=name;
	}
	
	void showdata() {
		System.out.println("Roll no ="+Roll+ " and name =" +Name);
	}
	
}
public class Student {

	public static void main(String[] args) {
		StudentDemo e3 =new StudentDemo();
		e3.setdata(81, "Sachin");
		e3.showdata();
		StudentDemo e1 =new StudentDemo();
		e1.setdata(102, "Sumit");
		e1.showdata();
		StudentDemo e2 =new StudentDemo();
		e2.setdata(99, "Shudanshu");
		e2.showdata();
		
	}

}