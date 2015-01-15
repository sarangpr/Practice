package misc;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int reverse(int x) {
        int temp=0;
        while(x!=0){
            if(temp>(((Integer.MAX_VALUE)-(x%10))/10)){
                throw new IllegalArgumentException("cannot reverse this int");
            }
            temp=(temp*10)+(x%10);
            x=x/10;
        }
        return temp;
    }
}
