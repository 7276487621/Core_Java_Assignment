import java.util.Scanner;
class Subject{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your subject mark:");
		
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int d=sc.nextInt();
	int e=sc.nextInt();
		
	System.out.println("Sum of subject is ="+(a+b+c+d+e));
	System.out.println("Average percentage is ="+((a+b+c+d+e)/5)+"%");
	}
}