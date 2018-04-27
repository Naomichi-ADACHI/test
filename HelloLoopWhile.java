public class HelloLoopWhile{
	static final String str = "Hello World";
	
	public static void main(String[] args){
		int i = 0;
		while(i < 5){
			System.out.println(++i + " : " + str);
		}
	}
}