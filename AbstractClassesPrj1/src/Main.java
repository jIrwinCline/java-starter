abstract class Graphic {
	protected int x1, x2;
	protected int y1, y2;
	
	public void setStart(int x, int y) {
		x1 = x;
		y1 = y;
		
	}
	public void setEnd(int x, int y) {
		x2 = x;
		y2 = y;
	}
	public abstract void draw();
}

class Line extends Graphic {

	@Override
	public void draw() {
		System.out.printf(" draw line from (%d, %d) to (%d, %d) %n", x1, x2, y1, y2 );
	}
}
class Rectangle extends Graphic {
	@Override
	public void draw() {
		System.out.printf(" draw rectangle from (%d, %d) to (%d, %d) %n", x1, y1, x2, y2);
	}
}
public class Main {
	
	static void drawUtil(int x1, int y1, int x2, int y2, Graphic g) {
		g.setStart(x1, y1);
		g.setEnd(x2,  y2);
		g.draw();
	}

	public static void main(String[] args) {
//		drawUtil(10, 10, 20, 20, new Graphic());
		drawUtil(30, 30, 40, 40, new Line());
		drawUtil(50, 50, 60, 60, new Rectangle());
//		Graphic g1 = new Graphic();
//		g1.setStart(10,10);
//		g1.setEnd(20, 20);
//		g1.draw();
		
//		Graphic g2 = new Line();
//		g2.setStart(30,30);
//		g2.setEnd(40, 40);
//		g2.draw();
		
//		Graphic g3 = new Rectangle();
//		g3.setStart(50,50);
//		g3.setEnd(60, 60);
//		g3.draw();
	}

}
