public class Polyspiral {

  public static void main(String[] args) {
    Turtle hank = new Turtle();

    hank.delay(5);

    // 3-spiral
    polySpiral(hank,  3, 20, 5);
    hank.penup();
    hank.forward(500);
    hank.pendown();

    // 5-spiral
    polySpiral(hank,  5, 10, 4);
    hank.penup();
    hank.forward(500);
    hank.pendown();

    // 8-spiral
    polySpiral(hank,  8, 5, 3);
    hank.hideturtle();
  }

  public static void polySpiral(Turtle t, int n, double base, int rounds){
    for(int i=0; i<rounds*n; i++){
      // each spiral needs n sides, rounds * n = the total amount of lines segment we need, to create this polyspiral
      t.forward((i + 1) * base);
      // using the only number that is changing, i, to enlarge the base everytime
      t.right(360/n); // get the angle of each turn
    }

    for(int i=0; i<rounds*n; i++){
      t.left(360/n);
      // turn turtle back to the angle of the previous end of line
      t.backward((rounds*n-i) * base);
      // turn the turtle back to origin by going counter-clockwisely
    }


  }

}

