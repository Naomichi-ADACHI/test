public class OutputData2{
	public static void main(String[] args){
		String name = "";
		int age = 0;
		
		name = args[0];
		age = Integer.parseInt(args[1]);
		
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
	}
}