package misc;

public class RoundRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private boolean isRoundRotation(String a, String b){
		if(a.length()!=b.length()){
			return false;
		}
		String c = a+a;
		return c.contains(b);
	}
}
