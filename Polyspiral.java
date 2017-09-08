public class Polyspiral {

  public static void main(String[] args) {
    Turtle hank = new Turtle();


    polySpiral(hank, 3, 10, 3);
    // squareSpiral2(hank, 10, 20);
  }

  public static void polySpiral(Turtle t, int n, double base, int rounds){
    for(int i=0; i<rounds*n; i++){
      t.forward((i + 1) * base);
      t.left(360/n);
    }

    for(int i=0; i<rounds*n; i++){
      t.right(360/n);
      t.backward((rounds*n-i) * base);
    }


  }

  // public static void squareSpiral2(Turtle t, double base, int numSides) {
  //   for (int i = 0; i < numSides; i++) {
  //     t.forward((i + 1) * base);
  //     t.left(90);
  //   }
  //   for (int i = 0; i < numSides; i++) {
  //     t.right(90);
  //     t.backward((numSides - i) * base);
  //   }
  // }

}

