public class SONTest{
	static final int SHOKOU = 100;
	static final int KOUSA = 400;
	static final int KOUSUU = 500;
	
	public static void main(String[] args){
		int[] array = new int[10101];
		
		for(int i = 0; i < KOUSUU; i++){
			if(i == 0){
				array[i] = SHOKOU;
			}else{
				array[i] = array[i - 1] + KOUSA;
			}
		}
		
		for(int i = 0; i < KOUSUU; i++){
			System.out.println(array[i]);
		}
	}
}