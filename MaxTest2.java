import java.util.Scanner;

public class MaxTest2{
	static int maxNumber(int[] array){
		int mx = -1;
		
		for(int i = 0; i < array.length; i++){
			mx = Math.max(mx, array[i]);
		}
		return mx;
	}
	
	static void init(int[] numbers, int n){
		numbers[0] = 17;
		numbers[1] = 68;
		numbers[2] = 14;
		numbers[3] = 55;
		numbers[4] = 70;
		numbers[5] = 12;
		numbers[6] = 21;
		numbers[7] = 63;
		numbers[8] = 88;
		numbers[9] = 50;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
		
		while(n < 10){
			System.out.println("Bad number");
			System.out.println("Input number : ");
			n = sc.nextInt();
		}
		int[] numbers = new int[n];
		
		init(numbers, n);
		
		System.out.println("Max = " + maxNumber(numbers));
	}
}