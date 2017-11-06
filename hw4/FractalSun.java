public class FractalSun{
	public static void main(String args[]){
		Turtle t = new Turtle();
		t.delay(0);
		fractalSun(t, 100, 5);
	}

	public static void fractalSun(Turtle t, double r, int level){
		fractalsun(t,r,level);
		t.color("black");
		//draw the background color
		t.penup();
		t.forward(level*r);
		t.fill();
	}
	public static void fractalsun(Turtle t, double r, int level){
		if(level>0){
			int red = 255;
			int green = 255 - 255/level;
			int blue = 0;
			// teal colors
			t.color(red, green, blue);
			circle(t, r);
			for(int i=0;i<8;i++){
				t.penup();
				t.forward(2*r);

				//extend to the next sun
				t.pendown();
				fractalsun(t,r/4,level-1);

				//draw a smaller part of the whole graph
				t.color(red, green, blue);
				t.penup();
				t.backward(0.5*r);
				t.pendown();
				t.backward(1.5*r);
				t.left(45);
			}
		}
	}
	public static void circle(Turtle t, double r){
		//draw a circle filled with the color of the turtle
		t.penup();
		t.forward(r);
		t.left(90);
		t.pendown();
		t.left(180.0/300);
		for(int i=0;i<300;i++){
			t.forward(2*Math.PI*r/300);
			t.left(360.0/300);
		}
		t.right(90+180.0/300);
		t.penup();
		t.backward(r);
		t.fill();
	}
}