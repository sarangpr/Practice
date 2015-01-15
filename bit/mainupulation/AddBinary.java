package bit.mainupulation;
import misc.ReverseString;


public class AddBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("11", "101"));
	}
	public static String addBinary(String num1, String num2){
		StringBuilder result = new StringBuilder();
		boolean carry=false;
		num1=ReverseString.reverseString(num1);
		num2=ReverseString.reverseString(num2);
		char[] num1_arr =num1.toCharArray(), num2_arr = num2.toCharArray();
		for(int i=0;i<Math.max(num1_arr.length,num2_arr.length);i++){
			char digit_1='0',digit_2='0';
			if(i<num1_arr.length){
				digit_1=num1_arr[i];
			}
			if(i<num2_arr.length){
				digit_2=num2_arr[i];
			}
			if((digit_1=='1')&&(digit_2=='1')){
				if(carry)
					result.append('1');
				else
					result.append('0');
				carry=true;
			}else if(((digit_1=='1')&&(digit_2=='0'))||((digit_1=='0')&&(digit_2=='1')
					)){
				if(!carry){
					result.append('1');
				}
				
				else{
					result.append('0');
				}
			}else{
				if(carry)
					result.append('1');
				else
					result.append('0');
				carry=false;
			}
		}
		if(carry)
			result.append('1');
		System.out.println(result);
		return ReverseString.reverseString(result.toString());
	}
	
}
