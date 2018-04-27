public class VacationSwitch{
	static final int VACATION = 100;
	
	public static void main(String[] args){
		
		System.out.print("This month is ");
		
		switch(VACATION){
			case 1:
				System.out.print("Spring");
				break;
			case 2:
				System.out.print("Summer");
				break;
			case 3:
				System.out.print("Winter");
				break;
			default:
				System.out.print("No");
				break;
		}
		
		System.out.println(" Vacation");
	}
}