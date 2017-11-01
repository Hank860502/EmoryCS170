public class Triangle extends Polygon{

	double side;

	public triangle(double side){
		this.side = side;
	}

	public String toString(){
		return "Triangle with side " + side;
	}

	public double perimeter(){
		return side * 3;
	}
}