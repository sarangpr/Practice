package misc;

public class KthPermutation {
	private static StringBuilder out = new StringBuilder();
	private static boolean[] used;
	static private String in;
	static private int counter=0;
	
    public static String getPermutation(int n, int k) {
        
        StringBuilder inSB = new StringBuilder();
        for(int i=1;i<=n;i++){
            inSB.append(i);
        }
        used = new boolean[n];
        in = inSB.toString();
        return permute(k);
    }
    
    static public String permute(int k){
		if(out.length()==in.length()){
		    if(++counter==k){
			    return out.toString();
		    }
		    return null;
		}
		for (int i =0;i<in.length();i++){
			if(!used[i]){
				out.append(in.charAt(i));
				used[i]=true;
				String temp = permute(k);
				if(counter==k)
				    return temp;
				used[i]=false;
				out.setLength(out.length()-1);
			}
		}
		return null;
	}
    public static void main(String[] args) {
    	System.out.println(getPermutation(9, 2));
    }
}
