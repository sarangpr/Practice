package machine.vending;

public class Soda {
	private enum Size{
		SMALL,MEDIUM,LARGE
	};
	Size size;
	String flavour;
//	int price;
	public int price;
	Soda(Size size,String flavour){
		this.size = size;
		this.flavour = flavour;
	}
}
