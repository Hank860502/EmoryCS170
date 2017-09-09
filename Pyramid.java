public class Pyramid{
	public static void main(String[] args){
		Turtle hank = new Turtle();

		hank.delay(5);
		pyramid(hank, 200, 5);

		hank.penup();
		hank.forward(400);
		hank.pendown();
		pyramid(hank, 200, 10);

		hank.penup();
		hank.forward(400);
		hank.pendown();
		pyramid(hank, 300, 10);
	}

	// levels 5=9square
	// levels 10=19square
	// the amount of squares at first layer should be 2*levels-1
	// -1, -2, -4, -6, -8
	public static void pyramid(Turtle t, double base, int levels){
		// base/(2*levels-1) = length of each square
		// 2*levels-1 = amount of squares in the first layer
		double lengthOfSquare = base/(2*levels-1);

		for(int l=0; l<levels; l++){
			// l*2= the amount each leayer is reducing, set l=1 and limit+1
			// looping for the squares of each level
			for(int i=0; i<2*levels-1-l*2; i++){

				// looping for each square
				for(int s=0; s<4; s++){
					t.forward(lengthOfSquare);
					t.left(90);
				}
				t.forward(lengthOfSquare); // move to next square
			}
			t.backward((2*levels-1-l*2)*lengthOfSquare); // turtle back to the origin of that layer, amount of square * length of square
			t.left(90);
			t.forward(lengthOfSquare);
			t.right(90);
			t.forward(lengthOfSquare);
			// turtle at the beginning of the next layer
		}
		// bring back turtle
		t.left(90);
		t.backward(levels*lengthOfSquare); // turtle back to bottom layer
		t.right(90);
		t.backward(levels*lengthOfSquare); // levels = amount of squares to the origin
	}
}