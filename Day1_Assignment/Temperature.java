import java.util.Scanner;
class Temperature{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the temp in Farenheit:");
	int f=sc.nextInt();
	int c=5*(f-32)/9;
	System.out.println("Temp in celcius is="+c);
	}
}