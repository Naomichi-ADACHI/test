import java.util.Scanner;

public class TestResult{
	static final int BORDER = 70;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n >= BORDER){
			System.out.println("you are passed!");
		}else{
			System.out.println("you are not passed :(");
		}
	}
}