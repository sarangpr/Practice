package misc;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=75;i++){
			if(i%35==0){
				System.out.println("foobar");
			}else if(i%7==0){
				System.out.println("bar");
			}else if(i%5==0){
				System.out.println("foo");
			}else{
				System.out.println(i);
			}
		}
	}

}
