public class Houseline{
	public static void main(String[] args){
		Turtle hank = new Turtle();

		hank.delay(5);
		houseline(hank, 20);

    hank.penup();
    hank.forward(400);
    hank.pendown();
    // test2
    houseline(hank, 10);

    hank.penup();
    hank.forward(400);
    hank.pendown();
    // test3
    houseline(hank, 4);
	}

	public static void houseline(Turtle t, int numHouses){
    double y=0;
    // set an variable y here to remember how far did the turtle moved forward
    
    for(int i=1; i<=numHouses; i++){
      house(t, i);
      t.penup();
      t.forward(4.0/3*(1.0/i*80));
      // set the distance between each house as 4/3
      y+=4.0/3*(1.0/i*80);
      // add the distance to variable y
      t.pendown();
    }

    t.penup();
    // !!!!!! I was trying to use the ledder formula
    // (top+bottom)*high/2
    // t.backward(((4.0/3*80)+4.0/3*(1.0/numHouses*80))*numHouses/2);
    // but dont know why does this not work?????
    t.backward(y);
    t.pendown();
	}

  // set a parameter houseNum to remember what is the current houses is the turtle drawing
	public static void house(Turtle t, double houseNum) {
    // pass the current house to module(front)
    front(t, houseNum);
    t.left(90);
    t.forward((1/houseNum)*80);
    // drawing the first houese, the base of the wall is 1/1*80, and drawing the 20th house is 1/20*80
    t.right(90);
    top(t, houseNum);
    // pass the current house to module(top)
    t.left(90);
    t.backward((1/houseNum)*80);
    t.right(90);
  }

  // simply pass 1/houseNum to all the module below that includes forward and backward command, to get the porpotional size of the house

  public static void front(Turtle t, double houseNum) {
    walls(t, houseNum);
    t.forward((1/houseNum)*30);

    // pass the current house to module(door)
    door(t, houseNum);
    t.penup();
    t.left(90);
    t.forward((1/houseNum)*50);
    t.right(90);
    t.backward((1/houseNum)*20);
    t.pendown();

    // pass the current house to module(window)
    windows(t, houseNum);
    t.penup();
    t.backward((1/houseNum)*10);
    t.left(90);
    t.backward((1/houseNum)*50);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, double houseNum) {
    // pass the current house to module(roof)
    roof(t, houseNum);
    t.penup();
    t.forward((1/houseNum)*10);
    t.left(90);
    t.forward((1/houseNum)*10);
    t.right(90);
    t.pendown();

    // pass the current house to module(chimney)
    chimney(t, houseNum);
    t.penup();
    t.backward((1/houseNum)*10);
    t.right(90);
    t.forward((1/houseNum)*10);
    t.left(90);
    t.pendown();
  }

  public static void walls(Turtle t, double houseNum) {
    square(t, (1/houseNum)*80);
  }

  public static void windows(Turtle t, double houseNum) {
    square(t, (1/houseNum)*20);
    t.penup();
    t.forward((1/houseNum)*40);
    t.pendown();
    square(t, (1/houseNum)*20);
    t.penup();
    t.backward((1/houseNum)*40);
    t.pendown();        
  }

  public static void door(Turtle t, double houseNum) {
    for (int j = 0; j < 2; j++) {
      t.forward((1/houseNum)*20);
      t.left(90);
      t.forward((1/houseNum)*30);
      t.left(90);
    }
  }

  public static void roof(Turtle t, double houseNum) {
    t.forward((1/houseNum)*80);
    t.left(135);
    t.forward((1/houseNum)*40 * Math.sqrt(2));
    t.left(90);
    t.forward((1/houseNum)*40 * Math.sqrt(2));
    t.left(135);
  }

  public static void chimney(Turtle t, double houseNum) {
    t.left(90);
    t.forward((1/houseNum)*20);
    t.right(90);
    t.forward((1/houseNum)*10);
    t.right(90);
    t.forward((1/houseNum)*10);
    t.backward((1/houseNum)*10);
    t.left(90);
    t.backward((1/houseNum)*10);
    t.left(90);
    t.backward((1/houseNum)*20);
    t.right(90);
  }

  public static void square(Turtle t, double x) {
    for (int j = 0; j < 4; j++) {
      t.forward(x);
      t.left(90);
    }
  }
}