import java.util.Scanner;

public class Brackjack{
	static boolean[][] used = new boolean[4][13];
	static final int BORDER = 21;
	static final char[] MARK = {'H', 'S', 'C', 'D'};	//0:Heart 1:Spead 2:Clover 3:Dia
	static String name = "";
	static int playerCard = 0;
	static int dealerCard = 0;
	static boolean bust = false;
	static boolean dealerBust = false;
	static int[] playerNum = new int[100];
	static int[] playerMark = new int[100];
	static int[] dealerNum = new int[100];
	static int[] dealerMark = new int[100];
	
	static void init(){
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				used[i][j] = false;
			}
		}
		for(int i = 0; i < 100; i++){
			playerNum[i] = -1;
			playerMark[i] = -1;
			dealerNum[i] = -1;
			dealerMark[i] = -1;
		}
		
		playerCard = 0;
		dealerCard = 0;
		bust = false;
		dealerBust = false;
		playerCard = hit(playerNum, playerMark, playerCard, true);
		dealerCard = hit(dealerNum, dealerMark, dealerCard, false);
		playerCard = hit(playerNum, playerMark, playerCard, true);
		dealerCard = hit(dealerNum, dealerMark, dealerCard, false);
	}
	static void err(int n){
		System.out.println("---err---" + n);
	}
	
	static int calcPoint(int[] userNum, int[] userMark, int userCard, int ace){
		int point = 0;
		for(int i = 0; i < userCard; i++){
			if(userNum[i] >= 11){
				point += 10;
			}else if(userNum[i] == 1){
				//TODO
				point += 1;
				//continue;
			}else{
				point += userNum[i];
			}
		}
		
		int tmp = point;
		
		//TODO:ace
		/*
		for(int i = 0; i < 2; i++){
			
		}*/
		
		
		return point;
	}
	
	//player 0:dealer's turn  1:player's turn
	static int hit(int[] userNum, int[] userMark, int userCard, boolean player){
		int num = (int)(Math.random() * 13) + 1;
		int mark = (int)(Math.random() * 4);
		
		userNum[userCard] = num;
		userMark[userCard] = mark;
		
		if(player){
			System.out.println("Get " + MARK[mark] + num);
		}
		
		used[mark][num - 1] = true;
		
		return ++userCard;
	}
	
	static int cntAce(int[] userNum, int userCard){
		int cnt = 0;
		for(int i = 0; i < userCard; i++){
			if(userNum[i] == 1){
				cnt++;
			}
		}
		return cnt;
	}
	
	//mask : dealer's card mask on/off
	static void print(boolean mask){
		System.out.println("--" + name + "'s card --");
		for(int i = 0; i < playerNum.length; i++){
			if(playerMark[i] == -1){
				break;
			}else{
				System.out.print(MARK[playerMark[i]]);
				System.out.println(playerNum[i]);
			}
			
		}
		System.out.println("Point : " + calcPoint(playerNum, playerMark, playerCard, cntAce(playerNum, playerCard)));
		System.out.println();
		
		System.out.println("--Dealer's card --");
		for(int i = 0; i < dealerNum.length; i++){
			if(dealerMark[i] == -1){
				break;
			}else{
				if(mask && i > 0){
					System.out.println("¡");
				}else{
					System.out.print(MARK[dealerMark[i]]);
					System.out.println(dealerNum[i]);
				}
			}
		}
		
		if(!mask){
			System.out.println("Point : " + calcPoint(dealerNum, dealerMark, dealerCard, cntAce(dealerNum, dealerCard)));
		}
		System.out.println();
	}
	
	static boolean yesNo(String message){
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		boolean cont = false;
		boolean ret = false;
		while(!cont){
			System.out.print(message + "[yes/no] : ");
			str = sc.next();
			if(str.equals("yes")){
				ret = true;
				cont = true;
			}else if(str.equals("no")){
				cont = true;
			}
		}
		return ret;
	}
	
	//ret 1:win -1:lose 0:draw
	static int judge(){
		int ret = 0;
		int playerPoint = calcPoint(playerNum, playerMark, playerCard, cntAce(playerNum, playerCard));
		int dealerPoint = calcPoint(dealerNum, dealerMark, dealerCard, cntAce(dealerNum, dealerCard));
		
		if((!bust && (playerPoint > dealerPoint)) || dealerBust){
			ret = 1;
		}else if(!bust && (playerPoint == (dealerPoint))){
			ret = 0;
		}else{
			ret = -1;
		}
		return ret;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int gameCnt = 0;
		int gameWin = 0;
		
		System.out.print("Input name : ");
		name = sc.next();
		
		boolean play = true;
		while(play){
			System.out.println();
			System.out.println("™™" + (gameCnt + 1) + "th game™™");
			init();
			print(true);
			boolean game = yesNo("Hit?");
			while(game){
				//player's turn
				playerCard = hit(playerNum, playerMark, playerCard, true);
				print(true);
				if(calcPoint(playerNum, playerMark, playerCard, cntAce(playerNum, playerCard)) > BORDER){
					bust = true;
					game = false;
					System.out.println("!!Bust!!");
					break;
				}
				game = yesNo("Hit?");
				System.out.println();
			}
			
			//dealer's turn
			if(bust || ((dealerNum[0] == 1 && dealerNum[1] == 6) || (dealerNum[0] == 6 && dealerNum[1] == 1))){
				print(false);
			}else{
				while(calcPoint(dealerNum, dealerMark, dealerCard, cntAce(dealerNum, dealerCard)) <= 16){
					dealerCard = hit(dealerNum, dealerMark, dealerCard, false);
					
					if(calcPoint(dealerNum, dealerMark, dealerCard, cntAce(dealerNum, dealerCard)) > BORDER){
						dealerBust = true;
					}
				}
				print(false);
			}
			
			switch(judge()){
				case 1:
					System.out.println("!!!Win!!!");
					gameWin++;
					break;
				case 0:
					System.out.println("Draw");
					break;
				case -1:
					System.out.println("Lose:(");
					break;
				default:
					return;
			}
			
			gameCnt++;
			System.out.println("Play : " + gameCnt + " Win : " + gameWin);
			play = yesNo("Continue?");
			
			System.out.println();
		}
		
		System.out.println("Bye!");
	}
}