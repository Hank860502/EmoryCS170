public class VeggiePizza extends Pizza {
  PizzaIngredientFactory factory;

  public VeggiePizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheeses = factory.createCheeses();
    veggies = factory.createVeggies();
  }
}
