public class Hanoi{
	static final int N = 5;
	static int[][] tower = new int[3][1010];
	
	//tower[0][0] : left.bottom
	//tower[0][N - 1] : left.top
	static void init(){
		for(int i = 0; i < 5; i++){
			tower[0][i] = N - i;
		}
	}
	
	//get tower height
	static private int getHeight(int[] ary){
		int height = 0;
		for(int i = 0; i < N; i++){
			if(ary[i] != 0){
				height++;
			}
		}
		return height;
	}
	
	//push disk
	//pos : tower's position
	//disk : disk size
	static void push(int pos, int disk){
		int top = getHeight(tower[pos]);
		tower[pos][top] = disk;
	}
	
	//pop disk
	//pos : tower's position
	static int pop(int pos){
		int top = getHeight(tower[pos]);
		int ret = tower[pos][top - 1];
		tower[pos][top - 1] = 0;
		return ret;
	}
	
	static void line(){
		System.out.println();
	}
	
	//print tower and disk condition
	static void print(){
		for(int i = N - 1; i >= 0; i--){
			for(int j = 0; j < 3; j++){
				if(tower[j][i] > 0){
					for(int k = 0; k < N - tower[j][i]; k++){
						System.out.print(" ");
					}
					System.out.print("|");
					for(int k = 0; k < tower[j][i]; k++){
						System.out.print("-");
					}
					
					System.out.print("|");//center line
					
					for(int k = 0; k < tower[j][i]; k++){
						System.out.print("-");
					}
					System.out.print("|");
					for(int k = 0; k < N - tower[j][i]; k++){
						System.out.print(" ");
					}
				}else{
					for(int k = 0; k < N - tower[j][i]; k++){
						System.out.print(" ");
					}
					System.out.print(" ");

					System.out.print("|");//center line
						
					for(int k = 0; k < N - tower[j][i]; k++){
						System.out.print(" ");
					}
					System.out.print(" ");
				}
			}
			line();
		}
		line();
	}
	
	//disk move(from -> to)
	//spare : spare tower position
	//numOfDisk : number of moving disk
	static void hanoi(int from, int to, int spare, int numOfDisk){
		if(numOfDisk > 1){
			hanoi(from, spare, to, numOfDisk - 1);
			push(to, pop(from));
			print();
			hanoi(spare, to, from, numOfDisk - 1);
			print();
		}else{
			push(to, pop(from));
		}
	}
	
	public static void main(String[] args){
		init();
		
		System.out.println("--Before--");
		print();
		
		hanoi(0, 2, 1, N);
		
		System.out.println("--After--");
		print();
	}
}