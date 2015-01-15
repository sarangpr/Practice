package misc;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcb"));
	}
	public static boolean isPalindrome(String word){
		if (word==null||word.length()==0){
			return false;
		}
		char[] word_arr = word.toCharArray();
		int i=0,j=word_arr.length-1;
		while(i<=j){
			if(word_arr[i++]!=word_arr[j--]){
				return false;
			}
		}
		return true;
	}
	public static String longestPalindrome(String word){
		char[] word_arr = word.toCharArray();
		int i=0,j=0;
		while(word_arr[i]!=word_arr[++j]);
		
		return null;
	}
}
