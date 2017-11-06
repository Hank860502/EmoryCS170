public class MickeyFace {
	public static void main(String args[]){
		Turtle t = new Turtle();
		t.delay(0);
		mickeyFace(t, 200);
	}

	public static void mickeyFace(Turtle t, double r){
		t.left(90);
		t.forward(r);
		t.right(90);
		double sides = 1000;
		double angle = 180/(sides-2);
		double x=Math.sin(angle * Math.PI / 180)*r*2;
		for(int i=0; i<sides; i++){
			t.forward(x);
			t.right(360/sides);
		};
		t.right(90);
		t.forward(r);
		t.left(90);

	}
}