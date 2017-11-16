public interface PizzaIngredientFactory {

  public Dough createDough();

  public Sauce createSauce();

  public Cheese[] createCheeses();

  public Veggies[] createVeggies();

  public Pepperoni createPepperoni();
}
