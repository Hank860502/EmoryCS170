public class SquareLine {
	public static void main(String[] args){
		Turtle hank= new Turtle();
		for(int h=0; h<3; h++){
			for(int k=0; k<5; k++){
				for(int i=0; i<4; i++){
					hank.pendown();
					hank.forward(40);
					hank.left(90);
				}
				hank.penup();
				hank.forward(100);
			}
			hank.penup();
			hank.backward(500);
			hank.left(90);
			hank.forward(50);
			hank.right(90);
			hank.pendown();
		}
	}
}