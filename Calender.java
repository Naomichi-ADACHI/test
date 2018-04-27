import java.util.Scanner;

public class Calender{
	public static void main(String[] args){
		int[] manth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true){
			System.out.print("‰½ŒŽ‚ð•\Ž¦‚µ‚Ü‚·‚©H : ");
			n = sc.nextInt();
			if(n >= 1 && n <= 12){
				break;
			}
			System.out.println("³‚µ‚¢ŒŽ‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}
		
		System.out.println("“ú ŒŽ ‰Î … –Ø ‹à “y");
		for(int i = 1; i <= manth[n - 1]; i++){
			System.out.printf("%2d ", i);
			
			if(i % 7 == 0){
				System.out.println();
			}
		}
	}
}