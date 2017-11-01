public class Polygon{

	double side;
	int numSides;

	public Polygon(double side, int numSides){
		this.side = side;
		this.numSides = numSides;
	}

	public String toString(){
		return "Polygon with " + numSides " sides of length " + side;
	}

	public double perimeter(){
		return side * numSides;
	}
}