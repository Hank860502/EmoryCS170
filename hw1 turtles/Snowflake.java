public class	Snowflake {
	public static void main(String[] args){
		Turtle hank = new Turtle();
			hank.delay(0);
			// snowflake(hank, 100, 5);
			// squareflake(hank, 400, 5);
			sierpinski(hank, 400, 10);
		}

	public static void snowflakeSide(Turtle t, double length, int level){
		if(level == 0){
			t.forward(length);
		} else {
			snowflakeSide(t, length/3, level-1);
			t.left(60);
			snowflakeSide(t, length/3, level-1);
			t.right(120);
			snowflakeSide(t, length/3, level-1);
			t.left(60);
			snowflakeSide(t, length/3, level-1);
		}
	}

	public static void snowflake(Turtle t, double length, int level){
		for(int i=0; i<3; i++){
			snowflakeSide(t, length, level);
			t.right(60);
		}
	}

	public static void squareflakeSide(Turtle t, double length, int level){
		if(level == 0){
			t.forward(length);
		} else {
			squareflakeSide(t, length/3, level-1);
			t.left(90);
			squareflakeSide(t, length/3, level-1);
			t.right(90);
			squareflakeSide(t, length/3, level-1);
			t.left(90);
			squareflakeSide(t, length/3, level-1);
			t.left(90);
			squareflakeSide(t, length/3, level-1);
		}	
	}
	
	public static void squareflake(Turtle t, double length, int level){
		for(int i=0; i<4; i++){
			squareflakeSide(t, length, level);
			t.right(90);
		}
	}

	public static void sierpinski(Turtle t, double size, int level){
		if(level==0){
			triangle(t, size);
		} else{
			sierpinski(t, size/2, level-1);
			t.forward(size/2);
			sierpinski(t, size/2, level-1);
			t.left(120);
			t.forward(size/2);
			t.right(120);
			sierpinski(t, size/2, level-1);
			t.left(60);
			t.backward(size/2);
			t.right(60);
		}
	}

	public static void triangle(Turtle t, double x){
		for(int i=0; i<3; i++){
			t.forward(x);
			t.left(120);
		}
	}
}