import java.util.Scanner;
class SI{
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount,ROI and Time:");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		
		System.out.println("SI="+(p*r*t)/100);
		
	}
}