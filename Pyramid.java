public class Pyramid{
	public static void main(String[] args){
		Turtle hank = new Turtle();

		pyramid(hank, 200, 5);

		// pyramid(hank, 200, 10);
		// pyramid(hank, 300, 10);
	}

	// levels 5=9square
	// levels 10=19square
	// the amount of squares at base should be 2*levels-1

	public static void pyramid(Turtle t, double base, int levels){
		// looping for the squares of each level
		for(int i=0; i<2*levels-1; i++){
			// looping for each square
			for(int s=0; s<4; s++){
				t.forward(base/(2*levels-1));
				t.left(90);
			}
			t.forward(base/(2*levels-1)); // move to next square
		}
	}
}