package misc;

public class StringSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("aaab", "ab"));
	}
	public static int strStr(String haystack, String needle) {
		int needleLen = needle.length();
		int haystackLen = haystack.length();
	    int needleHash = needle.hashCode();
		if (needleLen == haystackLen && needleLen == 0)
			return 0;
	 
		if (needleLen == 0)
			return 0;
		for(int i=0;i<=haystackLen-needleLen;i++){
			String currentString = haystack.substring(i, i+needleLen);
			currentString.intern();
			System.out.println(currentString);
			int curretStringHash = currentString.hashCode();
			if(needleHash==curretStringHash){
				if(needle.equals(currentString)){
					return i;
				}
			}
		}
		return -1;
    }
	private static boolean stringCompare(String needle, String string) {
		// TODO Auto-generated method stub
		return true;
	}
}
