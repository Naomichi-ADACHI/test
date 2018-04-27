import java.util.Scanner;

public class CalTestCmd{
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
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Number : " + a);
		System.out.println("Number : " + b);
		System.out.println("Add : " + add(a, b));
		System.out.println("Sub : " + sub(a, b));
		System.out.println("Mul : " + mul(a, b));
		System.out.println("Div : " + (b == 0 ? -1 : div(a, b)));
		System.out.println("Mod : " + (b == 0 ? -1 : sur(a, b)));
	}
}