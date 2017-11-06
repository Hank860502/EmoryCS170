// draw a snowflake that draw more snow flakes at the branches

public class MyFractal{
	public static void main(String args[]){
		Turtle t = new Turtle();
		t.delay(0);
		// myFractal(t, 100, 3);
		myFractal(t, 100, 5);
		t.penup();
		t.forward(500);
		t.pendown();
		myFractal(t, 100, 4);
	}

	public static void myFractal(Turtle t, double r, int level){
		int red = 0;
    int green = 255 - (255-51*level);
    int blue = 255;
    t.color(red, green, blue);
		if(level>0){
			for(int i=0; i<8; i++){
				t.penup();
				t.forward(2*r);

				//extend to the next sun
				t.pendown();
				myFractal(t, r/4, level-1);

				t.color(red, green, blue);


				t.penup();
				t.backward(0.5*r);
				t.pendown();
				t.backward(1.5*r);
				t.left(45);
			}

		}
	}
}