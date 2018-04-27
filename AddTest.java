public class AddTest{
	static int add(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args){
		int a = 60;
		int b = 20;
		System.out.println("Number : " + a);
		System.out.println("Number : " + b);
		System.out.println("Sum : " + add(a, b));
	}
}