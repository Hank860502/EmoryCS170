public class MedievalTown{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		hank.delay(0);
		// hank.forward(100);
		// double x=Math.PI;
		// System.out.printf("" +x);

		stick(hank);
		hank.forward(50);
		wall(hank);
		// should add a penup() here before forward, but line is already there so I think it doesn't matter
		hank.forward(80);
		arc(hank);
		hank.penup();
		hank.forward(40);
		hank.pendown();
		wall(hank);
		hank.forward(80);
		stick(hank);
		hank.penup();
		hank.forward(20);
		hank.left(90);
		hank.forward(10);
		hank.right(90);
		// move turtle to the point that I can loop the arc thrice
		for(int i=0; i<3; i++){
			hank.penup();
			hank.forward(60);
			hank.left(90);
			hank.forward(20);
			hank.right(90);
			hank.pendown();
			arc(hank);
		};
		hank.penup();
		hank.right(90);
		hank.forward(90);
		hank.right(90);
		hank.forward(30);
		hank.left(180);
		// move turtle to where the bottom row of tree starts
		trees(hank);
		// bottom layer of trees
		hank.left(90);
		hank.penup();
		hank.forward(40);
		hank.right(90);
		hank.forward(40);
		trees(hank);


		// tree(hank);
		// hank.forward(100);
		// star(hank);
		// hank.forward(100);
		// mountain(hank);
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
		// t.right(90);
		// t.forward(20);
		// t.left(90);
		// t.forward(10);
		// t.backward(10);
		// t.right(90);
		// t.backward(20);
		// t.left(90);
		// im testing out that my angles are right, by drawing out the actual triangle at the stick, because the wall seems to overlap my sticks by a little
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
			if(i<7){
				t.forward(80);
				t.backward(80);
				t.left(90);
				t.forward(5);
				t.right(90);
			}else{
				t.forward(80);
				t.backward(80);
				t.left(90);
				t.backward(35);
				t.right(90);
			}
		};
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
		t.pendown();
		// turtle back in original start point
		// i can actualy leave the turtle there since i am always going to draw the next element on the right; however, it's a better practice to bring back the turtle to it's origin
	};

	public static void arc(Turtle t){
		t.forward(10);
		t.left(90);
		t.forward(30);
		double sides = 1000;
		// I set this variable so that the arc could be as perfect as I want
		double angle = 180/(sides-2);
		// angle of a 30-gon
		double x=Math.sin(angle* Math.PI / 180)*10*2;
		double y=Math.sin(angle* Math.PI / 180)*20*2;
		// using the formula: radius=s/[2sin/180/n], where s=length of side and n=number of sides, to get the value of each times turle has to move forward
		//Math.sin() only takes radian, so angle * Math.PI/180 get the radian first
		for(int i=0; i<sides/2; i++){
			t.forward(x);
			t.right(360/sides);
		};
		t.forward(30);
		t.left(90);
		t.forward(10);
		t.left(90);
		t.forward(30);
		for(int i=0; i<sides/2; i++){
			t.forward(y);
			t.left(360/sides);
		};
		t.forward(30);
		t.left(90);
		// turtle back in origin
	};

	public static void tree(Turtle t){
		double x=Math.sqrt(200);
		// diagonal of one square to determine how long is the leaf, square of 10*10+10*10

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

	public static void trees(Turtle t){
		for(int i=0; i<4; i++){
			tree(t);
			t.penup();
			t.forward(30);
			t.pendown();
		};
		t.penup();
		t.backward(120);
		// turtle back to origin
	};
	// draw four trees at once

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

	public static void mountain(Turtle t){
		t.left(30);
		double x=Math.sqrt(160*160+80*80);
		// square root of the sum of two sides squares is the hypotenuse, this gets one side of the mountain
		t.forward(x);
		t.right(90);
		double y=Math.sqrt(120*120+60*60);
		// second side of the mountain
		t.forward(y);

		t.penup();
		t.right(120);
		t.forward(220);
		t.right(90);
		t.forward(30);
		t.pendown();
		t.right(90);
		// not so sure if the turle is back in origin

		// turtle back in original start point

	};

}
