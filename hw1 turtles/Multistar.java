public class Multistar{
	public static void main(String[] arg){
		Turtle hank = new Turtle();
		hank.delay(5);

		// first test, 7 stars
		multistar(hank, 7, 100);
		hank.penup();
    hank.forward(300);
    hank.pendown();

    // 10 stars
		multistar(hank, 10, 70);
		hank.penup();
    hank.forward(300);
    hank.pendown();

    // 25 stars
		multistar(hank, 25, 120);
		hank.hideturtle();
	}

	public static void multistar(Turtle t, int n, double length){
		for(int i=0; i<n; i++){
			t.forward(length);
			// use length to draw the first line of the big star

			for(int j=0; j<n; j++){
				t.forward(length/4);
				// first line of the small star starts from the entension of big star, since small star is 1/4 of the big star, forward by length/4
				t.backward(length/4);
				t.right(360.0/n); // needs to have decimal to calculate the correct angle of each star
			}
			t.backward(length);
			t.left(360.0/n); // decimal for accurate angle as well here
			// end of the program, turtle is at the origin
		}

	}
}