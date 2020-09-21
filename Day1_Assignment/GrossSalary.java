import java.util.Scanner;
class GrossSalary{
public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    System.out.println("Find GrossSalary");
		int basic,hra,da,gs;
		basic=sc.nextInt();
		if(basic<10000){
		hra=basic*10/100;
		da=basic*90/100;
		gs=basic+hra+da;
		}
		else{
		hra=2000;
		da=basic*98/100;
		gs=basic+hra+da;
		System.out.println("GrossSalary is ="+gs);
		System.out.println("hra is ="+hra);
		System.out.println("da is ="+da);
		
		}
	}
}