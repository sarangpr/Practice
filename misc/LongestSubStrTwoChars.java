package misc;

public class LongestSubStrTwoChars {
//	private static char[] string;
	private static int[] auxArray;
	
	public static void main(String[] args) {
		System.out.println(longestSubStr("aaaaaaaaaa".toCharArray()));
	}
	public static int longestSubStr(char[] string){
		if(string.length==0){
			return -1;
		}
		if(string.length<2){
			return string.length;
		}
		auxArray = new int[string.length];
		char prev = string[0];
		int charCount = 1;
		auxArray[0]=1;
		for (int i = 1; i < string.length; i++) {
			char c = string[i];
			if(prev==c){
				charCount++;
			}else{
				charCount=1;
			}
			auxArray[i] = charCount;
			prev =c;
		}
		char firstChar = string[0], secondChar=string[1];
		int maxLength = 2;
		int currentLength =2;
		for(int i=2;i<string.length;i++){
			char current = string[i];
			if(current==firstChar||current==secondChar){
				currentLength++;
			}else{
				firstChar = secondChar;
				secondChar = current;
				currentLength = auxArray[i-1]+1;
			}
			if(currentLength>maxLength) 
				maxLength = currentLength;
		}
		return maxLength;
	}
}
