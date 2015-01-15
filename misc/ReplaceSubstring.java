package misc;

import java.util.Arrays;

public class ReplaceSubstring {
	private static final String PATTERN = "abc";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replace("abcadxsfgabcabc"));
	}
	private static boolean isMatching(char[] string,String pattern){
		for(int i=0;i<pattern.length();i++){
			if(pattern.charAt(i)!=string[i])	return false;
		}
		return true;
	}
	public static String replace(String string){
		if(string.length()<3||string==null){
			return string;
		}
		int fastPointer=0,slowPointer=0;

		char[] string_arr = string.toCharArray();
		while(string_arr.length>fastPointer){
			if(isMatching(Arrays.copyOfRange(string_arr, fastPointer, string_arr.length), PATTERN)){
				string_arr[slowPointer]='X';
				fastPointer+=3;
				slowPointer++;
			}else{
				string_arr[slowPointer++]=string_arr[fastPointer++];
			}
		}
		return String.valueOf(Arrays.copyOfRange(string_arr, 0, slowPointer));
	}
}
