abstract class Base {
	public abstract void f();
	public abstract void g();
	
	public void h() {
		System.out.println("h() in Base");
	}
}

abstract class Derived extends Base {
	public void f() {
		System.out.println("f() in Derived");
	}
	public void g() {
		System.out.println("g() in Derived");
	}
}

class Derived1 extends Derived {
	public void g() {
		System.out.println("g() in Derived1");
	}
}
public class Main {

	public static void main(String[] args) {
		Base b; // ref var
		
//		b = new Base(); // object and assigned to b
		Derived d;
//		d = new Derived();
		
		Derived1 d1;
		d1 = new Derived1();
	}

}
