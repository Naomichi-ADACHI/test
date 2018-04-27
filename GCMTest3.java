import java.util.Scanner;

public class GCMTest3{
	
	static int getGcm(int a, int b){
		int mx = 1;
		for(int i = 1; i <= Math.min(a, b); i++){
			if(a % i == 0 && b % i == 0){
				mx = i;
			}
		}
		
		return mx;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int a = sc.nextInt();
		System.out.print("Input Number : ");
		int b = sc.nextInt();
		
		System.out.println("greatest common divisor is " + getGcm(a, b));
	}
}