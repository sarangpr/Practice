package misc;

public class LuckyNumber {
	public static boolean isLucky(int num){
		int temp;
		if(num==0)
			return false;
		while(num>0){
			temp=num%10;
			if(temp!=4&&temp!=5){
				return false;
			}
			num=num/10;
		}
		return true;
	}
	public static String makeLucky(int n){
		String result="";
		int count=0,i=0;
		while(count<=n-1){
			if(isLucky(i)){
				count++;
				result=(Integer.toString(i))+result;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(makeLucky(10));
		int[] character=new int[256];
		++character[(int)'a'];
		System.out.println();
	}

}
