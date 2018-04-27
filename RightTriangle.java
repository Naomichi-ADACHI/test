public class RightTriangle{
	static final int N = 7;
	
	public static void main(String[] args){
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}