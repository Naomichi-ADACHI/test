public class PrintOdd{
	public static void main(String[] args){
		
		System.out.println("��50�ȉ��̊");
		for(int i = 1; i <= 50; i++){
			if(i % 2 == 1){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}