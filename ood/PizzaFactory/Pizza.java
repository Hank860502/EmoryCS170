public abstract class Pizza {
  protected String name;
  protected Dough dough;
  protected Sauce sauce;
  protected Veggies[] veggies;
  protected Cheese[] cheeses;
  protected Pepperoni pepperoni;

  protected abstract void prepare();

  protected void setName(String name) {
    this.name = name;
  }

  protected String getName() {
    return name;
  }

  public String toString() {
    String result = "";
    result += ("---- " + name + " ----\n");
    if (dough != null) {
      result += dough;
      result += "\n";
    }
    if (sauce != null) {
      result += sauce;
      result += "\n";
    }
    if (cheeses != null && cheeses.length != 0) {
      for (int i = 0; i < cheeses.length; i++) {
        result += cheeses[i];
        if (i < cheeses.length - 1) {
          result += ", ";
        }
      }
      result += "\n";
    }
    if (veggies != null && veggies.length != 0) {
      for (int i = 0; i < veggies.length; i++) {
        result += veggies[i];
        if (i < veggies.length - 1) {
          result += ", ";
        }
      }
      result += "\n";
    }
    if (pepperoni != null) {
      result += pepperoni;
      result += "\n";
    }

    return result;
  }
}
