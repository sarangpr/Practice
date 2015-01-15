package misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {

	public static void main(String[] args) {
		GenerateParenthesis gp = new GenerateParenthesis();
		List<String> list = new ArrayList<>();
		brackets(5,0,new StringBuilder(),list);
		for(String s: list){
			System.out.println(s);
		}
	}
	public List<String> generateParenthesis(int n) {
        return new ArrayList<>(generateParenthesisHelper(n));
    }
	
	static void brackets(int openStock, int closeStock, StringBuilder s,List<String> list) {
        if (openStock == 0 && closeStock == 0) {
        	list.add(s.toString());
        	
            return;
        }
        if (openStock > 0) {
            brackets(openStock-1, closeStock+1, s.append('('),list);
            s.setLength(s.length()-1);
        }
        if (closeStock > 0) {
            brackets(openStock, closeStock-1, s.append(')'),list);
            s.setLength(s.length()-1);
        }
    }
    
	public List<String> generateParenthesis2(int n) {
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<Integer> diff = new ArrayList<Integer>();
	 
		result.add("");
		diff.add(0);
	 
		for (int i = 0; i < 2 * n; i++) {
			ArrayList<String> temp1 = new ArrayList<String>();
			ArrayList<Integer> temp2 = new ArrayList<Integer>();
	 
			for (int j = 0; j < result.size(); j++) {
				String s = result.get(j);
				int k = diff.get(j);
	 
				if (i < 2 * n - 1) {
					temp1.add(s + "(");
					temp2.add(k + 1);
				}
	 
				if (k > 0 && i < 2 * n - 1 || k == 1 && i == 2 * n - 1) {
					temp1.add(s + ")");
					temp2.add(k - 1);
				}
			}
	 
			result = new ArrayList<String>(temp1);
			diff = new ArrayList<Integer>(temp2);
		}
	 
		return result;
	}
	
    private Set<String> generateParenthesisHelper(int n){
        if(n==1){
            Set<String> set = new HashSet<>();
            set.add("()");
            return set;
        }
        Set<String> set = generateParenthesisHelper(n-1);
        Set<String> newSet = new HashSet<>();
        for(String s: set){
            newSet.add("()"+s);
            newSet.add("("+s+")");
            newSet.add(s+"()");
        }
        return newSet;
    }
}
