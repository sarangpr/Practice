package pattern.design;

public interface Visitor<T> {
	public Visitor visit(Visitor v);
	public T visit(VisitableImpl a);
	public double visit(double a);
}
