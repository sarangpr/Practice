package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animals> list = new ArrayList<>();
		Main m = new Main();
		m.addDog(list);
		m.printAnimals((ArrayList<Animals>)list);
		String a = "a";
		String b = "a";
		System.out.println(a==b);
		System.out.println(b);
		
	}
	private void addDog(List<Animals> list){
		list.add(new Dog());
	}
	private void printAnimals(ArrayList<Animals> list){
		for(Animals a:list){
			a.getName();
		}
	}
}
