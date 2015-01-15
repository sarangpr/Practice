package misc;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class PrintRepeatedChars {
	public static void main(String[] args) {
		printRepeatedChars("zxcasdaczf");
	}
	public static void printRepeatedChars(String string){
		Map<Character,Boolean> hashMap = new TreeMap<>();
		for(int i=0;i<string.length();i++){
			if(hashMap.get(string.charAt(i))==null){
				hashMap.put(string.charAt(i), false);
			}else if(!hashMap.get(string.charAt(i))){
				hashMap.put(string.charAt(i), true);
			}
		}
		Iterator<Entry<Character, Boolean>> it = hashMap.entrySet().iterator();
		while(it.hasNext()){
			Entry<Character,Boolean> entry = it.next();
			if(entry.getValue()){
				System.out.print(entry.getKey()+" ");
			}
		}
	}
}
