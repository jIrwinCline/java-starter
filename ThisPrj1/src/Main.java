// This Keyword
class Sample {
	private int value;
	
	public Sample() {
		this(10); //this will use the other constructor and pass a default of 10
	}
	public Sample(int n) {
		
	}
	public void set(int value) {
		this.value = value;
	}
	
	public void print() {
		System.out.println(this.value);
	}
}

public class Main {

	public static void main(String[] args) {
		Sample s1, s2;
		
		s1 = new Sample();
		s2 = new Sample();
		
		s1.set(10);
		s2.set(20);
		
		s1.print();
		s2.print();
	}

}
