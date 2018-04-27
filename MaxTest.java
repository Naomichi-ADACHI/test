public class MaxTest{
	static int maxNumber(int[] array){
		int mx = -1;
		
		for(int i = 0; i < array.length; i++){
			mx = Math.max(mx, array[i]);
		}
		return mx;
	}
	
	public static void main(String[] args){
		int[] numbers = {17, 68, 14, 55, 70, 12, 21, 63, 88, 50};
		
		System.out.println("Max = " + maxNumber(numbers));
	}
}