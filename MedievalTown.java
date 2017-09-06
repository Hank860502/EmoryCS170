public class MedievalTown{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		
		// hank.forward(100);
		// double x=Math.PI;
		// System.out.printf("" + x);
		// stick(hank);
		// wall(hank);
		// arc(hank);
		// tree(hank);
		star(hank);
	};

	public static void square(Turtle t){
		for(int i = 0; i < 4; i++) {
			t.forward(10);
			t.left(90);
		};
	};

	public static void stick(Turtle t){
		double x = Math.sqrt(500);
		// square root of 20*20 + 10*10 to get the length of the roof

		t.forward(50);
		t.left(90);
		t.forward(100);
		t.right(60);
		t.forward(x);
		t.left(60);
		t.forward(20);
		t.left(90);
		t.forward(10);
		t.left(90);
		t.forward(10);

		// LOOP bump * 5
		for(int i=0; i<4; i++){
		// PART1
			for(int j=0; j<2; j++){
				t.right(90);
				t.forward(10);
			};
			// PART2
			for(int k=0; k<2; k++){
				t.left(90);
				t.forward(10);
			};
		}
		// Split each bump on the roof to two parts, the first part handles all the right turns and forward. Second part handles all the left turns and forward. After creating one little bump loop it 5 times to create the whole roof.

		t.forward(10);
		t.left(60);
		t.forward(x);
		t.right(60);
		t.forward(100);
		t.left(90);
		// turtle back in original start point

		// start to draw windows on the stick
		for(int i=0; i<2; i++){
			t.forward(20);
			t.left(90);
			t.penup();
			t.forward(40);
			t.pendown();
			for(int j=0; j<3; j++){
				t.pendown();
				square(t);
				t.penup();
				t.forward(20);
			};
			t.backward(100);
			t.right(90);
		};
		// Split windows into left and right parts and loop it twice

		t.backward(40);
		t.pendown();
		// turtle back in original start point

	};

	public static void wall(Turtle t){
		for(int i=0; i<8; i++){
			t.forward(80);
			t.backward(80);
			t.left(90);
			t.forward(5);
			t.right(90);
		};
		t.left(90);
		t.backward(40);
		t.right(90);
		// draw all long lines and return to origin
		for(int j=0; j<8; j++){
			t.forward(5);
			t.left(90);
			for(int i=0; i<3; i++){
				t.penup();
				t.forward(5);
				t.pendown();
				t.forward(5);
			};
			// dashes of 3

			t.penup();
			t.backward(30);
			t.right(90);
			t.forward(5);
			t.left(90);
			// get ready to draw the next column 
			for(int i=0; i<4; i++){
				t.pendown();
				t.forward(5);
				t.penup();
				t.forward(5);
			};
			// dashes of 4
			t.penup();
			t.backward(40);
			t.right(90);
			// set up for next loop
		};
		// 8 sets of this combination

		t.backward(80);
		// turtle back in original start point
	};

	public static void arc(Turtle t){
		t.forward(10);
		t.left(90);
		t.forward(30);
		double pi= Math.PI;
		double x= 20*pi/2;
		// half perimeter of the inside arc
		t.right(pi);
		t.forward(100);
		t.right(90);
		t.penup();
		t.forward(10);
		// move turtle to center of the circle
	};

	public static void tree(Turtle t){
		double x=Math.sqrt(200);

		t.left(90);
		t.forward(15);
		// main line for the tree and stop 5 before reaching the first leaf
		for(int i=0; i<5; i++){
			t.forward(5);
			t.left(135);
			t.forward(x);
			t.penup();
			t.left(135);
			t.forward(20);
			t.left(135);
			t.pendown();
			t.forward(x);
			t.right(45);
			// drawing one leaf
		};
		t.backward(40);
		t.right(90);
		// turtle back in original start point

	};

	public static void star(Turtle t){
		for(int i=0; i<7; i++){
			t.forward(10);
			t.left(135);
			t.forward(10);
			t.left(180);
		};
		// 7 sets of small triangles
		t.forward(10);
		t.right(135);
		t.forward(10);
		t.left(90);
		// turtle back in original start point
	};
	
}
