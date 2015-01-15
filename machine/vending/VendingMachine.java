package machine.vending;

public class VendingMachine {
	Slot[][] slots;
	
	 class Slot{
		final int MAXCAPACITY;
		Soda type;
		int price;
		int quantity;

		Slot(int capacity,Soda type){
			this.price = type.price;
			this.type = type;
			MAXCAPACITY = capacity;
		}
		
		void addSodas(Soda[] array,int x,int y){
			
		}
	}
}
