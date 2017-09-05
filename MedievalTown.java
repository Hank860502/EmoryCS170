public class MedievalTown{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		
		// hank.forward(100);
		stick(hank);
		// System.out.printf("" + x);
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


}
