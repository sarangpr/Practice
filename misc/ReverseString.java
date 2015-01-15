package misc;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}
	public static String reverseString(String word){
		if(word==null){
			throw new IllegalArgumentException("String cannot be null");
		}
		char[]word_arr = word.toCharArray();
		int i=0,j=word_arr.length-1;
		char temp;
		while(i<=j){
			temp = word_arr[i];
			word_arr[i++]=word_arr[j];
			word_arr[j--]=temp;
		}
		return new String(word_arr);
	}
}
