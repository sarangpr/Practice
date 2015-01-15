package misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = subsetsWithDup(new int[]{0});
		for(List<Integer> l: list){
			for(int i:l){
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}
	public static List<List<Integer>> subsetsWithDup(int[] num) {
        return new ArrayList<>(subset(num, num.length-1));
    }
    private static Set<List<Integer>> subset(int[] num, int index){
        if(index==-1){
            Set<List<Integer>> ret = new LinkedHashSet<>();
            ret.add(new ArrayList<Integer>());
            return ret;
        }
        
        Set<List<Integer>> temp = subset(num,index-1);
        Set<List<Integer>> newList = new HashSet<>(temp);
        for(List<Integer> l: temp){
            List<Integer> tempList = new ArrayList<>(l);
            tempList.add(num[index]);
            newList.add(tempList);
        }
        temp=null;
        return newList;
    }
}
