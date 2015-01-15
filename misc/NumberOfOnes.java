package misc;


public class NumberOfOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfOnes(0b11110));
	}
	public static int numberOfOnes(int number){
		try{}
		catch(NumberFormatException n){}
		catch(Exception e){};
		int count=0;
		int mask = 0b1;
		for(int i = 0;i<=32;i++){
			if((mask&number)!=0){
				count++;
			}
			mask = mask<<1;
		}
		return count;
	}
}
