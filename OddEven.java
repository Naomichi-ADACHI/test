public class OddEven{
	static final int N = 2;
	
	public static void main(String[] args){
		
		System.out.print(N + " : ");
		if(N > 0){
			System.out.println((N % 2 == 0) ? "Even" : "Odd");
		}else{
			System.out.println("Set more than 0");
		}
	}
}