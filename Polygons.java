public class Polygons{
	public static void main(String[] args){
		Turtle bob = new Turtle();
		// square(bob, 50);
		// triangle(bob, 40);
		// bob.color("yellow");
		// pentagon(bob, 40);
		// polygon(bob, 40, 120);
		dashedPolygon(bob, 80, 5, 6);

	}

	public static void square(Turtle t, double size){
		for(int i=0; i<4; i++){
			t.forward(size);
			t.left(90);
		}
	}

	public static void triangle(Turtle t, double size){
		for(int i=0; i<3; i++){
			t.forward(size);
			t.left(120);
		}
	}

	public static void pentagon(Turtle t, double size){
		for(int i=0; i<5; i++){
			t.forward(size);
			t.left(72);
		}
	}

	public static void polygon(Turtle t, double size, double sides){
		for(int i=0; i<sides; i++){
			t.forward(size);
			t.left(360/sides);
		}
	}

	public static void dash(Turtle t, double length, int numDashes){
		for(int i=0; i<numDashes-1; i++){
			t.forward(length/(2*numDashes-1));
			t.penup();
			t.forward(length/(2*numDashes-1));
			t.pendown();
		}
	}

	public static void dashedPolygon(Turtle t, double length, int numDashes, int numSides){
		for(int i=0; i<numSides; i++){
			dash(t, length, numDashes);
			t.left(360.0/numSides);
		}
	}

}