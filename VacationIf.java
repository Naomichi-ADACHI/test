public class VacationIf{
	static final int VACATION = 100;
	
	public static void main(String[] args){
		
		System.out.print("This month is ");
		
		if(VACATION == 1){
			System.out.print("Spring");
		}else if(VACATION == 2){
			System.out.print("Summer");
		}else if(VACATION == 3){
			System.out.print("Winter");
		}else{
			System.out.print("No");
		}
		
		System.out.println(" Vacation");
	}
}