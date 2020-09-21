import java.util.Scanner;
class Primitive4{
public static void main(String args[]){
		boolean x;
		boolean y;
		System.out.println("Enter the value of x and y as True or False");
		Scanner sc=new Scanner(System.in);
		x=sc.nextBoolean();
		y=sc.nextBoolean();
		boolean z=x && y || !(x||y);
		System.out.println("The value of z is="+z);
	}
}