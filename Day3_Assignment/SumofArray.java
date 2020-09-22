import java.util.Scanner;

class SumofArray{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int rows=sc.nextInt();
		int arr[][]=new int[rows][];
		int sum=0;
		
		int p[]=new int[4];
		int q[]=new int[4];
		int r[]=new int[3];
		int s[]=new int[3];
		int t[]=new int[3];
			
		arr[0]=p;
		arr[1]=q;
		arr[2]=r;
		arr[3]=s;
		arr[4]=t;
			
		for(int i=0;i<arr.length;i++){
		
			for(int j=0;j<arr[i].length;j++){
				System.out.println("Enter the number for "+i+" "+j+":");
				arr[i][j]=sc.nextInt();
			
			}
		}
			for(int i=0;i<arr.length;i++){
			
			
				for(int j=0;j<arr[i].length;j++){
					sum=sum+arr[i][j];
				}
			}
			
			System.out.println("sum of array elements="+sum);
		
	}
}