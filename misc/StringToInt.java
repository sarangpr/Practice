package misc;

public class StringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(StringToInt("99999999999"));
		
	}
	public static int StringToInt(String number){
		int num=0;
		char[] numArr = number.toCharArray();
		boolean postitive = true;
		if(numArr[0]=='-'){
			postitive = false;
		}
		for(int i=0;i<numArr.length;i++){
			int temp;
			switch((int)numArr[i]){
			case (int)'0':
				temp = 0;
			break;
			case (int)'1':
				temp=1;
			break;
			case (int)'2':
				temp=2;
			break;
			case (int)'3':
				temp =3;
			break;
			case (int)'4':
				temp =4;
			break;
			case (int)'5':
				temp =5;
			break;
			case (int)'6':
				temp=6;
			break;
			case (int)'7':
				temp=7;
			break;
			case (int)'8':
				temp=8;
			break;
			case (int)'9':
				temp=9;
			break;
			default:
				temp=0;
			}
			if(Integer.MAX_VALUE - (num*10) < temp){
				System.err.println("Value too big");
				break;
			}
			num=(num*10)+ temp;
		}
		num = postitive ? num*1 : num*(-1);
		return num;
	}
}
