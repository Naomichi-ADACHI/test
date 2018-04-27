public class SearchString{
	static final String[] FLUITS = {"apple", "orange", "melon", "peach", "lemon", "grape"};
	static final String S = "tomato";
	
	public static void main(String[] args){
		boolean hit = false;
		for(int i = 0; i < FLUITS.length; i++){
			if(FLUITS[i].equals(S)){
				hit = true;
				break;
			}
		}
		System.out.println(str + "‚ª" + (hit ? "Œ©‚Â‚©‚è‚Ü‚µ‚½" : "Œ©‚Â‚©‚è‚Ü‚¹‚ñ"));
	}
}