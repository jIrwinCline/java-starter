class Base {
	public void f() {
		System.out.println("f() in Base");
	}
	public void g() {
		System.out.println("g() in Base");
	}
	
}
class Derived extends Base {
	public void g() {
		System.out.println("g() in Derived");
	}
	public void h() {
		System.out.println("h() in Derived");
	}
}
public class Main {

	public static void main(String[] args) {
		Base b1 = new Base();
		b1.f();
		b1.g();
		
		System.out.println();
		
		Derived d1 = new Derived();
		d1.f();
		d1.g();
		d1.h();
		
		Base b2 = new Derived();
		b2.f();
		b2.g();
		
	}

}
