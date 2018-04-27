public class Square{
	static final int W = 10;
	static final int H = 5;
	public static void main(String[] args){
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}