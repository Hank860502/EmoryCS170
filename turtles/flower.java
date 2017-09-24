public class flower{
	public static void main(String[] args){
		Turtle hank = new Turtle();
		hank.delay(5);
		flower(hank, 6, 15, 70);
	};

	public static void polygon(Turtle t, double sides, double size){
		for(int i=0; i<sides; i++){
			t.forward(size);
			t.left(360/sides);
		};
	};

	public static void petal(Turtle t, int numLayers, double length){
		for(int i=0; i<numLayers; i++){
			polygon(t, i+3, length);
		}
	};

	public static void flower(Turtle t, int numPetals, int numLayers, double length){
		for(int i=0; i <numPetals; i++){
			petal(t, numLayers, length);
			t.forward(length);
			t.right(360/numPetals);
		};
	}
}