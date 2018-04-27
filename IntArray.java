public class IntArray{
	public static void main(String[] args){
		int[] numbers = new int[5];
		for(int i = 1; i <= 5; i++){
			numbers[i - 1] = i * 10;
		}
		
		System.out.println("Top : " + numbers[0]);
		System.out.println("Last : " + numbers[4]);
	}
}