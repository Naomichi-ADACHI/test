public class HelloLoopDoWhile{
	static final String str = "Hello World";
	
	public static void main(String[] args){
		int i = 0;
		do{
			System.out.println(++i + " : " + str);
		}while(i < 5);
	}
}