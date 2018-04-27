import java.util.Scanner;

public class Hello2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("Input your name : ");
		
		name = sc.next();
		
		System.out.println("Hello " + name + "!");
		
	}
}