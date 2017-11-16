public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese[] createCheeses() {
    Cheese[] cheeses = {new ReggianoCheese()};
    return cheeses;
  }

  public Veggies[] createVeggies() {
    Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    return veggies;
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
