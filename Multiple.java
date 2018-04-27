public class Multiple{
	static final int N = 500;
	static final int MUL = 19;
	
	public static void main(String[] args){
		int cnt = 0;
		
		System.out.println("" + N + "ˆÈ‰º‚Ì" + MUL + "‚Ì”{”");
		for(int i = MUL; i <= N; i += MUL){
			cnt++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("ŒÂ”‚ÍA" + cnt);
	}
}