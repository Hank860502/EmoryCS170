public class Houseline{
	public static void main(String[] args){
		Turtle hank = new Turtle();

		hank.delay(5);
		houseline(hank, 20);
	}

	public static void houseline(Turtle t, int numHouses){
    double y=0;
    // set an variable y here to remember how far did the turtlr moved forward
    for(int i=1; i<=numHouses; i++){
      house(t, i);
      t.penup();
      t.forward(4.0/3*(1.0/i*80));
      y+=4.0/3*(1.0/i*80);
      // add the distance to y
      t.pendown();
    }
    
    t.penup();
    // (top+bottom)*high/2
    // t.backward(((4.0/3*80)+4.0/3*(1.0/numHouses*80))*numHouses/2);
    // dont know why does this not work?????
    t.backward(y);
    t.pendown();
	}

	public static void house(Turtle t, double houseNum) {
    front(t, houseNum);
    t.left(90);
    t.forward((1/houseNum)*80);
    t.right(90);
    top(t, houseNum);
    t.left(90);
    t.backward((1/houseNum)*80);
    t.right(90);
  }

  public static void front(Turtle t, double houseNum) {
    walls(t, houseNum);
    t.forward((1/houseNum)*30);
    door(t, houseNum);
    t.penup();
    t.left(90);
    t.forward((1/houseNum)*50);
    t.right(90);
    t.backward((1/houseNum)*20);
    t.pendown();
    windows(t, houseNum);
    t.penup();
    t.backward((1/houseNum)*10);
    t.left(90);
    t.backward((1/houseNum)*50);
    t.right(90);
    t.pendown();
  }

  public static void top(Turtle t, double houseNum) {
    roof(t, houseNum);
    t.penup();
    t.forward((1/houseNum)*10);
    t.left(90);
    t.forward((1/houseNum)*10);
    t.right(90);
    t.pendown();
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