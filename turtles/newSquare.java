public class newSquare {

  public static void main(String[] args) {
    Turtle hank = new Turtle();

    hank.penup();
    hank.backward(460);
    hank.pendown();
    multiSquare(hank, 20, 5);

    hank.penup();
    hank.forward(220);
    hank.pendown();
    concentricSquares(hank, 20, 5);

    hank.penup();
    hank.forward(230);
    hank.pendown();
    squareSpiral(hank, 10, 20);
  }

  public static void polyspiral(Turtle t, double sides, double length, double layers){

  }

  public static void square(Turtle t, double x) {
    for (int i = 0; i < 4; i++) {
      t.forward(x);
      t.left(90);
    }
  }

  public static void multiSquare(Turtle t, double base, int numSquares) {
    for (int i = 0; i < numSquares; i++) {
      square(t, (i + 1) * base);
    }
  }

  public static void concentricSquares(Turtle t, double base, int numSquares) {
    for (int i = 0; i < numSquares; i++) {
      square(t, (2 * i + 1) * base);
      t.penup();
      t.backward(base);
      t.right(90);
      t.forward(base);
      t.left(90);
      t.pendown();
    }
    t.penup();
    t.forward(base * numSquares);
    t.left(90);
    t.forward(base * numSquares);
    t.right(90);
    t.pendown();
  }


  public static void squareSpiral(Turtle t, double base, int numSides) {
    for (int i = 0; i < numSides; i++) {
      t.forward((i + 1) * base);
      t.left(90);
    }
    for (int i = 0; i < numSides; i++) {
      t.right(90);
      t.backward((numSides - i) * base);
    }
  }
}