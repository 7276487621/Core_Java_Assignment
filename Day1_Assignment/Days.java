import java.util.Scanner;
class Days{
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of days:");
		int year,month,days,number_of_days,Days_in_month=30;
		number_of_days=sc.nextInt();
		year=number_of_days/365;
		month=(number_of_days % 365)/Days_in_month;
		days=(number_of_days % 365) % Days_in_month;
		System.out.println("Years="+year);
		System.out.println("Monts="+month);
		System.out.println("Days="+days);
	}
}