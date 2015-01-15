package misc;

public class RemoveChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(removeChar("hello how are you", "r"));
	}
	public static String removeChar(String sentence, String remove){
		int source =0, destination =0;
		char[] sentArr = sentence.toCharArray();
		char[] removeArr = remove.toCharArray();
		boolean[] charMap = new boolean[128];
		for(int i = 0; i<removeArr.length;i++){
			charMap[removeArr[i]] = true;
		}
		for(source=0;source<sentArr.length ;++source){
			if(!charMap[sentArr[source]]){
				sentArr[destination++]=sentArr[source];
			}
		}
		return new String(sentArr,0,destination);
		
	}
}
