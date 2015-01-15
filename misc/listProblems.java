package misc;
import java.util.HashMap;
import java.util.Stack;


public class listProblems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		String x=new String("Google");
		x=x.toLowerCase();
		System.out.println(x);
		char[] word = x.toCharArray();
		for(int i=0;i<x.length();i++){
			Integer num = map.get((Character)word[i]);
			if(num==null){
				map.put((Character)word[i],(Integer)1);
			}
			else{
				map.put((Character)word[i],++num);
			}
		}
		for(int i=0;i<x.length();i++){
			Integer num=map.get((Character)word[i]);
			if((int)num>1){
				System.out.println(word[i]+" is the first repeated character");
				break;
			}
		}
	}


}
