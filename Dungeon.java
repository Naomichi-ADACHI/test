import java.util.Scanner;

public class Dungeon{
	static final int X = 9;
	static final int Y = 9;
	static int posX = 1;
	static int posY = 1;
	static boolean haveKey = false;
	static boolean clear = false;
	static boolean[] go = new boolean[4];//0:up 1:right 2:down 3:left
	//wall:1 door:2 key:3
	static int[][] dungeon = {
		{1, 1, 1, 1, 1, 1, 1, 1, 1}, 
		{1, 0, 0, 0, 0, 0, 0, 0, 1},
		{1, 1, 1, 1, 1, 0, 1, 1, 1},
		{1, 0, 0, 0, 0, 0, 0, 0, 1},
		{1, 0, 1, 0, 1, 1, 1, 0, 1},
		{1, 2, 1, 0, 3, 0, 0, 0, 1},
		{1, 0, 1, 1, 1, 1, 1, 0, 1},
		{1, 0, 1, 0, 0, 0, 0, 0, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1},
	};
	
	static void coursePrint(){
		for(int i = 0; i < Y; i++){
			for(int j = 0; j < X; j++){
				if(i == posY && j == posX){
					System.out.print("人");
				}else{
					switch(dungeon[i][j]){
					case 1:
						System.out.print("■");
						break;
					case 2:
						System.out.print("扉");
						break;
					case 3:
						System.out.print(haveKey ? "  " : "鍵");
						break;
					default:
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
	
	
	static void print(String str){
		System.out.print(str);
	}
	static void line(){
		System.out.println();
	}
	
	static void direction(){
		for(int i = 0; i < 4; i++){
			go[i] = false;
		}
		print("進む方向を下から選び番号を入力してください。");

		if(posY - 1 >= 0){
			go[0] = true;
			print("0:上 ");
		}
		if(posX + 1 <= X - 1){
			go[1] = true;
			print("1:右 ");
		}
		if(posY - 1 <= Y - 1){
			go[2] = true;
			print("2:下 ");
		}
		if(posX - 1 >= 0){
			go[3] = true;
			print("3:左 ");
		}
	}
	
	static int direction(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String str = sc.next();
			
		}
	}
	
	public static void main(String[] args){
		print();
		while(!clear){
			Scanner sc = new Scanner(System.in);
			direction();
			
		}
	}
}