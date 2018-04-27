public class GCMTest2{
	
	static int getGcm(int a, int b){
		int mx = 1;
		for(int i = 1; i <= Math.min(a, b); i++){
			if(a % i == 0 && b % i == 0){
				mx = i;
			}
		}
		
		return mx;
	}
	
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("greatest common divisor is " + getGcm(a, b));
	}
}