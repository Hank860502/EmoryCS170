public abstract class PizzaStore {

  protected abstract Pizza createPizza(String item);

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    bake();
    cut();
    box();
    return pizza;
  }

  protected void bake() {
    System.out.println("Bake for 10 minutes at 500");
  }

  protected void cut() {
    System.out.println("Cutting the pizza into triangular slices");
  }

  protected abstract void box();
}
