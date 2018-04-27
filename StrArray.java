public class StrArray{
	public static void main(String[] args){
		String[] strAry = {"one", "two", "three", "four", "five"};
		
		for(int i = 0; i < 5; i++){
			System.out.print(strAry[i] + ", ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("----------");
		
		for(int i = 0; i < 5; i++){
			System.out.println(strAry[i]);
		}
	}
}