public class MedievalTown{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		
		// hank.forward(100);
		stick(hank);
		// System.out.printf("" + x);
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
		for(int i=0; i<4; i++){
			for(int j=0; j<2; j++){
				t.right(90);
				t.forward(10);
			};
			for(int k=0; k<2; k++){
				t.left(90);
				t.forward(10);
			}

		}
	}
}
