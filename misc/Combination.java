package misc;

public class Combination {

	public static String[] combo(String[] elements,int length){
		String[] results=new String[(int)Math.pow(elements.length, length)];
		if(length==1)
			return elements;
		else{
			String[] subList=combo(elements,length-1);
			int index=0;
			for(int i=0;i<elements.length;i++){
				for(int j=0;j<subList.length;j++){
					results[index++]=elements[i]+subList[j];
				}
			}
			return results;
		}
	}
	public static void main(String[] args) {
		String[] database = {"a","b","c","1","2","3"};
	    for(int i=1; i<=database.length; i++){
	        String[] result = combo(database, i);
	        for(int j=0; j<result.length; j++){
	            System.out.println(result[j]);
	        }
	    }

	}

}
