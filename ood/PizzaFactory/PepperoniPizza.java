public class PepperoniPizza extends Pizza {
  PizzaIngredientFactory factory;

  public PepperoniPizza(PizzaIngredientFactory factory) {
    this.factory = factory;
  }

  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = factory.createDough();
    sauce = factory.createSauce();
    cheeses = factory.createCheeses();
    veggies = factory.createVeggies();
    pepperoni = factory.createPepperoni();
  }
}
