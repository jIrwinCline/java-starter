// Technical points

// No Multiple Inheritance

class Vehicle {
	public String toString() {
		return "Hello";
	}
}
class TwoWheeler extends Vehicle {
	
}
class FourWheeler extends Vehicle {
	
}
class Bike extends TwoWheeler {
	
}
class Car extends FourWheeler {
	
}
public class Main {

	public static void main(String[] args) {
//		Sample s = new Sample();
//		System.out.println(s);
//		System.out.println(s.toString());
	}

}
