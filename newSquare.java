public class newSquare{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		// loopSquare(hank, 2, 4);
		loopSquare2(hank, 20, 4);
	};

	public static void square(Turtle t){
		for(int i = 0; i < 4; i++) {
			t.forward(10);
			t.left(90);
		};
	};

	// public static void loopSquare(Turtle t, double base, double numSquare){
	// 	for(int i = 0; i < numSquare; i++) {
	// 		square(t, (2*1+1)*base);
	// 	t.penup();
	// 	t.backkward(base);
	// 	t.right(90);
	// 	// not done
	// };

	public static void loopSquare2(Turtle t, double base, double numSquare){
		for(int i=0; i<numSquare; i++){
			t.forward((i+1)*base);
			t.left(90);
		};

	};
}