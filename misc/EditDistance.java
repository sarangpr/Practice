package misc;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getEditDistance("abcd".toCharArray(), "afgh".toCharArray()));
	}
	public static int getEditDistance(char[] string1,char[]string2){
		int[][] distances = new int[string1.length+1][string2.length+1];
		for(int i=1;i<=string1.length;i++){
			for(int j=1;j<=string2.length;j++){
				if(string1[i-1]==string2[j-1]){
					distances[i][j]=distances[i-1][j-1];
				}else{
					int deletion=distances[i][j-1]+1;
					int insertion=distances[i-1][j]+1;
					int substitution=distances[i-1][j-1]+1;
					distances[i][j]= Math.min(insertion, Math.min(deletion, substitution));
				}
				
			}
		}
		return distances[string1.length][string2.length]; 
		
	}
}
