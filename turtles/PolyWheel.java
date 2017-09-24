public class PolyWheel{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		
		hank.delay(5);

		// 3wheels
		polywheel(hank,3,70);
		hank.penup();
    hank.forward(200);
    hank.pendown();

    // 4wheels
		polywheel(hank,4,50);
		hank.penup();
    hank.forward(200);
    hank.pendown();

    // 5wheels
		polywheel(hank,5,40);
		hank.penup();
    hank.forward(200);
    hank.pendown();

    // 6wheels
		polywheel(hank,6,30);
		hank.penup();
    hank.forward(200);
    hank.pendown();

    //12wheels
		polywheel(hank,12,15);

		hank.hideturtle();
	};

	public static void polygon(Turtle t, double numSides, double length){
		for(int i=0; i<numSides; i++){
			t.forward(length);
			t.left(360/numSides);
		};
	};

	public static void polywheel(Turtle t, int numSides, double length){
		for(int i=0; i<numSides; i++){
			polygon(t, numSides, length);
			t.forward(length);
			// instead of turning left, turn right to continue drawing the next polygon
			t.right(360/numSides);
			// using the trait that the shape of the center wheel is always equal to numSides

			// no need to return origin cause turtle is at origin
		}

	}








};