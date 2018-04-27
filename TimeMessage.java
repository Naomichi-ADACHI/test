public class TimeMessage{
	static final int TIME = 17;
	
	public static void main(String[] args){
		System.out.print("it's " + TIME + " o'clock.");
		if(TIME >= 6 && TIME <= 11){
			System.out.println("Good Morning!");
		}else if(TIME >= 12 && TIME <= 17){
			System.out.println("Hello!");
		}else if(TIME >= 18 && TIME <= 23){
			System.out.println("Good Evening!");
		}else{
			System.out.println("Good Night!");
		}
	}
}