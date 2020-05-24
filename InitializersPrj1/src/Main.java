//Initializers

class Sample {
	static {
		// static intializer
		System.out.println("static initalizer");
	}
	{
		//non-static initalizer
		System.out.println("non-static initalizer");

	}
}

public class Main {

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();
	}

}
