public class Circle extends Shape {

	int radius;

	public Circle(double radius) {
		super("black");
		this.radius = radius;
	}

	public double perimeter(){
		return 2* Math.PI * radius;
	}

	public String toString() {
		return "Circle with radius" + radius;
	}
}