public class FractalFlower{
	public static void main(String args[]){
		Turtle t = new Turtle();
		t.left(90);
		t.delay(0);
		simpleFlower(t, 200);
		t.right(90);
		t.penup();
		t.forward(300);
		t.pendown();
		t.left(90);
		fractalFlower(t, 250, 3);
		t.right(90);
		t.penup();
		t.forward(300);
		t.pendown();
		t.left(90);
		fractalFlower(t, 300, 4);
		t.right(90);
		t.penup();
		t.forward(300);
		t.pendown();
		t.left(90);
	}

	public static void simpleFlower(Turtle t, double size){
		// using normal iteration draw a flower
		t.forward(size*2/3);
		for(int i=0; i<8; i++){
			t.forward(size/3);
			t.backward(size/3);
			t.left(45);
		}
		t.backward(size*2/3);
	}

	public static void fractalFlower(Turtle t, double size, int level){
		if(level == 0){
			simpleFlower(t, size);
			// draw a flower when hit the base case
		} else {
			t.forward(size*2/3);
			for(int i=0; i<8; i++){
				t.forward(size/3);
				t.backward(size/3);
				fractalFlower(t, size/3, level-1);
				// extend the branch to draw another level of flower
				t.left(360.0/8);
			}
			t.backward(size*2/3);
			
		}
	}

}