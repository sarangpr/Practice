package machine.vending;

public enum Cash {
	PENNY (0.01),DIME(0.10),QUARTER(0.25),DOLLAR(1.0),FIVE(5.0),TEN(10.0),HUNDRED(10.0);
	
	private double value;
	Cash(double value){
		this.value = value;
	}
	double getValue(){
		return value;
	}
}
