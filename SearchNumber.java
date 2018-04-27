import java.util.Scanner;

public class SearchNumber{
	static final int ANSWER = 77;
	static final int CHANCE = 10;
	
	static boolean check(int n){
		boolean hit = false;
		if(n > ANSWER){
			System.out.println("HIGH");
		}else if(n < ANSWER){
			System.out.println("LOW");
		}else{
			hit = true;
			System.out.println("Congratulation!!");
		}
		return hit;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		boolean clear = false;
		for(int i = 0; i < CHANCE; i++){
			System.out.print("Input number : ");
			num = sc.nextInt();
			clear = check(num);
			if(clear){
				break;
			}
		}
		if(!clear){
			System.out.println("GAME OVER");
		}
	}
}