package misc;

public class PermuteString {
	private StringBuilder out = new StringBuilder();
	private boolean[] used;
	private String in;
	
	public PermuteString(String in){
		this.in = in;
		used = new boolean[in.length()];
	}
	/**
	 * @param args
	 */
	public void permute(){
		if(out.length()==in.length()){
			System.out.println(out);
			return;
		}
		for (int i =0;i<in.length();i++){
			if(!used[i]){
				out.append(in.charAt(i));
				used[i]=true;
				permute();
				used[i]=false;
				out.setLength(out.length()-1);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermuteString ps = new PermuteString("aaa");
		ps.permute();
	}
	
}
