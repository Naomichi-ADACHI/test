import java.util.Scanner;

public class Calender{
	public static void main(String[] args){
		int[] manth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		while(true){
			System.out.print("何月を表示しますか？ : ");
			n = sc.nextInt();
			if(n >= 1 && n <= 12){
				break;
			}
			System.out.println("正しい月を入力してください");
		}
		
		System.out.println("日 月 火 水 木 金 土");
		for(int i = 1; i <= manth[n - 1]; i++){
			System.out.printf("%2d ", i);
			
			if(i % 7 == 0){
				System.out.println();
			}
		}
	}
}