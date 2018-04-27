import java.util.Scanner;

public class Bingo{
	static final int SIZE = 5;
	static final int MX = 100;
	static int[][] card = new int[SIZE][SIZE];
	static boolean[] usedNum = new boolean[101];
	static boolean[] used = new boolean[101];
	static boolean clear = false;

	static void init(){
		for(int i = 0; i < 101; i++){
			usedNum[i] = false;
			used[i] = false;
		}
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				//center
				if(i == SIZE / 2 && j == SIZE / 2){
					card[i][j] = -1;
				}else{
					int rand;
					do{
						rand = ((MX / SIZE) * j + 1 + (int)(Math.random() * (MX / SIZE)));
					}while(usedNum[rand]);
					card[i][j] = rand;
					usedNum[rand] = true;
				}
			}
		}
	}
	
	static void line(){
		System.out.println();
	}
	
	static void err(){
		System.out.println("hello");
	}
	static void aryPrint(int[] ary, String str){
		System.out.print(str + " = {");
		for(int i = 0; i < ary.length; i++){
			System.out.print(ary[i] + ", ");
		}
		System.out.println("}");
	}
	
	//print card
	static void print(int lizhi){
		for(int j = 0; j < SIZE * 3 + 1; j++){
			System.out.print("-");
		}
		line();
		
		for(int i = 0; i < (SIZE - 5) / 2; i++){
			System.out.print("|@");
		}
		System.out.print("|‚a|‚h|‚m|‚f|‚n|");
		for(int i = 0; i < (SIZE - 5) / 2; i++){
			System.out.print("@|");
		}
		line();
		for(int j = 0; j < SIZE * 3 + 1; j++){
			System.out.print("-");
		}
		line();
		
		for(int i = 0; i < SIZE; i++){
			System.out.print("|");
			for(int j = 0; j < SIZE; j++){
				if(card[i][j] == -1){
					System.out.printf("¡|");
				}else{
					System.out.printf("%2d|", card[i][j]);
				}
			}
			line();
			for(int j = 0; j < SIZE * 3 + 1; j++){
				System.out.print("-");
			}
			line();
		}
		if(!clear){
			System.out.println("lizhi : " + lizhi);
		}else{
			System.out.println("Congratulation!!");
		}
	}
	
	//search number
	static boolean hit(int n){
		boolean ht = false;
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				if(card[i][j] == n){
					card[i][j] = -1;
					ht = true;
				}
			}
		}
		return ht;
	}
	
	//determine number
	static int slot(){
		boolean ok;
		int n;
		do{
			n = 1 + (int)(Math.random() * MX);
		}
		while(used[n]);
		used[n] = true;
		System.out.println("Number : " + n);
		return n;
	}
	
	//count number of lizhi
	static int countLizhi(){
		int cnt;
		int cntLizhi = 0;
		
		//yoko
		for(int i = 0; i < SIZE; i++){
			cnt = 0;
			for(int j = 0; j < SIZE; j++){
				if(card[i][j] == -1){
					cnt++;
				}
			}
			if(cnt == SIZE){
				clear = true;
			}
			cntLizhi += cnt / (SIZE - 1);
		}
		
		//tate
		for(int i = 0; i < SIZE; i++){
			cnt = 0;
			for(int j = 0; j < SIZE; j++){
				if(card[j][i] == -1){
					cnt++;
				}
			}
			cntLizhi += cnt / (SIZE - 1);
			if(cnt == SIZE){
				clear = true;
			}
		}
		
		//naname(hidari->migi)
		cnt = 0;
		for(int i = 0; i < SIZE; i++){
			if(card[i][i] == -1){
				cnt++;
			}
		}
		cntLizhi += cnt / (SIZE - 1);
		if(cnt == SIZE){
			clear = true;
		}
		
		//naname(migi->hidari)
		cnt = 0;
		for(int i = SIZE - 1; i >= 0; i--){
			if(card[i][SIZE - 1 - i] == -1){
				cnt++;
			}
		}
		cntLizhi += cnt / (SIZE - 1);
		if(cnt == SIZE){
			clear = true;
		}
		
		return cntLizhi;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = null;
		int lizhi = 0;
		init();
		print(lizhi);
		while(!clear){
			str = sc.nextLine();
			int num = slot();
			if(hit(num)){
				System.out.println("Hit");
				print(countLizhi());
			}else{
				System.out.println("Deviate");
				print(countLizhi());
			}
		}
	}
}