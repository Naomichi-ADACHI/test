public class GCMTest{
	
	static int getGcm(int a, int b){
		int mx = 1;
		for(int i = 1; i <= Math.min(a, b); i++){
			if(a % i == 0 && b % i == 0){
				mx = i;
			}
		}
		
		return mx;
	}
	
	static int getGcm1(int a, int b){
		if(a % b == 0){
			return b;
		}else{
			return getGcm1(b, a % b);
		}
	}
	
	public static void main(String[] args){
		int a = 5623;
		int b = 421;
		if(b > a){
			int tmp = a;
			a = b;
			b = a;
		}
		
		System.out.println("greatest common divisor is " + getGcm1(a, b));
	}
}