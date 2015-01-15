package misc;

public class ReverseSentence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseWords("Hello this is a sentence"));

	}
	
	public static String reverseWords(String sentence){
		char[] sen = sentence.toCharArray();
		char temp;
		int nextIndex;
		int i=0,j=0;
		while(j<sen.length){
			while(j<sen.length-1&&sen[j+1]!=' '){
				j++;
			}
			nextIndex = j+2;
			while(i<=j){
				temp = sen[i];
				sen[i]= sen[j];
				sen[j]=temp;
				i++;
				j--;
			}
			i= j =nextIndex;
		}
		return reverseSentence(sen);
	}
	public static String reverseSentence(char[] sen){
		int i =0, j=sen.length-1;
		char temp;
		while(i<=j){
			temp=sen[i];
			sen[i]=sen[j];
			sen[j]=temp;
			i++;
			j--;
		}
		return new String(sen);
		
	}
}
