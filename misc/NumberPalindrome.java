package misc;

public class NumberPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1));
	}
	public static boolean isPalindrome(int x) {
		int temp=0;
		if(x>>31!=0)
			return false;
		while(x!=0){
			temp=(temp*10)+(x%10);
			x=x/10;
		}
		if(temp==x){
			return true;
		}
		else{
			return false;
		}
	}
}
