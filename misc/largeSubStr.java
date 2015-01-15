package misc;

public class largeSubStr {
	static int global_size=0,index_s,index_d;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdeabcea";
		String temp=new String("");
		int start=0,end;
		for(int i=0;i<input.length()-2;i++){
			for(int j=i+1;j<input.length()-1;j++){
				start=0;
				temp=input.substring(i, j);
				start = input.indexOf(temp, j);
				if(start>0){
				end=start+temp.length();
				}
				else
					end=-1;
				if (start>0&&global_size<temp.length()){
					global_size=temp.length();
					index_s=start;
					index_d=end;
				}
			}
		}
		System.out.println("the longest substring is \""+input.substring(index_s,index_d)+"\" at index "+global_size);
		
	}
	
}
