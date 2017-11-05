public class TurtleSpiral{
	public static void main(String args[]){
		Turtle t = new Turtle();
    t.delay(1);
    turtleSpiral(t, 400, 7);
    t.left(90);
    t.forward(300);
    t.pendown();
    turtleSpiralIter(t, 400, 7);
    // turtle facing differently so draw a little differently but the size is the same
	}

	public static void turtleSpiral(Turtle t, double size, double minSize){
		if(size<minSize){
 			t.penup(); // either do nothing or penup, I prefer return something -> stop drawing when size is smaller than minSize
		} else {
			t.forward(size);
			t.right(90);
			turtleSpiral(t, size*0.9, minSize); // 0.9 because size is decreasing 10% every time

		}
	}

	public static void turtleSpiralIter(Turtle t, double size, double minSize){
		double line = size; // dont want to change the size value
		while(line > minSize){
			t.forward(line);
			t.right(90);
			line*=0.9; // shorten line by 10% every time through
		}
	}
}