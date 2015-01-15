package misc;

import java.util.HashMap;

public class LongestNonRepString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;
		HashMap<Character, Integer> hashMap = new HashMap<>();
		int i = -1;
		int maxLength = Integer.MIN_VALUE;
		int currentLength = 0;
		while (++i < s.length()) {
			if (hashMap.get(s.charAt(i)) != null) {
				currentLength = 0;
				i = hashMap.get(s.charAt(i)) + 1;
				hashMap.clear();
			}
			hashMap.put(s.charAt(i), i);
			if (++currentLength > maxLength) {
				maxLength = currentLength;
			}
		}
		return maxLength;
	}
}
