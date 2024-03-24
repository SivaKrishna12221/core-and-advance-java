package javatpointAbs;

public class Rectangle extends Shape {
	void draw() {
		System.out.println("rectangle drawing");
	}

	// In real scenario method is called by the programmer
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();// in real scenario object is provided by the
					// method(implementation).eg.getShape()method
		Rectangle r = new Rectangle();
		r.draw();
	}
}
