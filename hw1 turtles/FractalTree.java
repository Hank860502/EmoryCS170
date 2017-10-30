public class	FractalTree {
	public static void main(String[] args){
		Turtle hank = new Turtle();
		hank.delay(0);
		hank.left(90);
		tree(hank, 100, 12);
	}

	public static void tree(Turtle t, double size, int level){
		if(level == 0){
			t.forward(size);
			t.backward(size);
		} else {
			t.forward(size);
			t.left(45);
			tree(t, size*0.6, level-1);
			t.right(90);
			tree(t, size*0.6, level-1);
			t.left(45);
			t.backward(size);
		}
	}
}