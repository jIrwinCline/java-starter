class BasicCalc {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
}

class ScientificCalc extends BasicCalc {
	public double sin(int deg) {
		double rad = deg * 3.14159 / 180;
		return Math.sin(rad);
	}
}

public class Main {

	public static void main(String[] args) {
		BasicCalc bcalc = new BasicCalc();
		
		System.out.println(bcalc.add(10, 20));
		System.out.println(bcalc.sub(10, 20));

		System.out.println();

		
		ScientificCalc sCalc1 = new ScientificCalc();
		
		System.out.println(sCalc1.add(10, 20));
		System.out.println(sCalc1.sub(10, 20));
		System.out.println(sCalc1.sin(90));
		
		BasicCalc bCalc2 = new ScientificCalc();
		System.out.println(bCalc2.add(10, 20));
		System.out.println(bCalc2.sub(10, 20));
//		System.out.println(bCalc2.sin(90)); // undefined for basic calc
		System.out.println(((ScientificCalc)bCalc2).sin(90));

	}

}
