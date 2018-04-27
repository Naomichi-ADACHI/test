public class Triangle{
	static final int NUM = 10;
	
	public static void main(String[] args){
		
		for(int i = 1; i <= NUM; i++){
			for(int j = NUM - i; j > 0; j--){
				System.out.print(" ");
			}
			for(int j = 1; j <= i * 2 - 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}