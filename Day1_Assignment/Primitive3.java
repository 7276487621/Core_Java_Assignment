class Primitive3{
public static void main(String args[]){
		int x=3;
		int y=4;
		int z=(x++ - --y - --x + x++);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}