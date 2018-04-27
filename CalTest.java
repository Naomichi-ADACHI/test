public class CalTest{
	static int add(int a, int b){
		return a + b;
	}
	static int sub(int a, int b){
		return a - b;
	}
	static int mul(int a, int b){
		return a * b;
	}
	static int div(int a, int b){
		return a / b;
	}
	static int sur(int a, int b){
		return a % b;
	}
	
	public static void main(String[] args){
		int a = 60;
		int b = 20;
		System.out.println("Number : " + a);
		System.out.println("Number : " + b);
		System.out.println("Add : " + add(a, b));
		System.out.println("Sub : " + sub(a, b));
		System.out.println("Mul : " + mul(a, b));
		System.out.println("Div : " + div(a, b));
		System.out.println("Mod : " + sur(a, b));
	}
}