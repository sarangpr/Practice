package misc;

public class B extends A {
	@Override
	public void foo(){
		System.out.println("B foo");
	}
	public void bar(){
		System.out.println("B bar");
	}
	public static void main(String[] args) {
		A a = new B();
		a.foo();
		((B)a).foo();
		((B)a).bar();
		
	}

}
