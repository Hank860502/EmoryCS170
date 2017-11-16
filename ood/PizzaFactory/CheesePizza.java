public class CheesePizza extends Pizza {
  PizzaIngredientFactory factory;

  public CheesePizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheeses = factory.createCheeses();
  }
}
