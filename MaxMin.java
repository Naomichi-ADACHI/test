public class MaxMin{
	
	static final double[] NUMBERS = {173., 168.2, 167.4, 155.3, 177., 170.2, 172., 167.3, 178.8, 175.};
	
	static double myMax(double a, double b){
		return (a > b ? a : b);
	}
	static double myMin(double a, double b){
		return (a < b ? a : b);
	}
	
	public static void main(String[] args){
		double mx = -1.;
		double mn = 1e5;
		
		for(int i = 0; i < NUMBERS.length; i++){
			mx = myMax(mx, NUMBERS[i]);
			mn = myMin(mn, NUMBERS[i]);
		}
		System.out.println("最大値は、" + mx);
		System.out.println("最小値は、" + mn);
	}
}