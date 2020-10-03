import java.util.Scanner;
class This{
	private int panId;
	private String panName;
	
	void setdata(int panId,String panName) {
		this.panId=panId;
		this.panName=panName;
	}
	
	void showdata() {
		System.out.println(panId + " " + panName);
	}
}




public class ThisKeyword {
	
	public static void main(String[] args) {
		This e1 = new This();
		e1.setdata(1205, "Sachin");
		e1.showdata();

	}

}
