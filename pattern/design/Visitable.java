package pattern.design;

public abstract class Visitable<T> {
	public abstract T accept(Visitor visitor); 
}
