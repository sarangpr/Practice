package pattern.design;

public class VisitableImpl<T> extends Visitable {

	@Override
	public T accept(Visitor visitor) {
		return (T) visitor.visit(this);
	}

}
