public class TestDiet{
	public static void main(String[] args){

		//test the given example
		IngredientDatabase db = new IngredientDatabase();
		Recipe cake = new Recipe("chocolate cake");
		cake.addIngredient(db.findIngredient("egg"), 4);
		cake.addIngredient(db.findIngredient("sugar"), 100);
		cake.addIngredient(db.findIngredient("butter"), 100);
		cake.addIngredient(db.findIngredient("flour"), 200);
		cake.addIngredient(db.findIngredient("milk"), 50);
		cake.addIngredient(db.findIngredient("cocoa"), 75);
		System.out.println(cake);
		System.out.println();
		System.out.println(cake.nutritionalValues());

		System.out.println();

		//test the findIngredient
		System.out.println(db.findIngredient("Hank"));

		//test toString() in class Ingredient
		Ingredient flour = new Ingredient("flour","g",0.11,0.012,0.75);
		System.out.println(flour);

	}
}
class Ingredient{

	private String name;
	private String unitMeasurement;
	private double proteinPerUnit;
	private double fatPerUnit;
	private double carbohydratesPerUnit;
	
	//Identify the constructor
	public Ingredient(String name, String unitMeasurement, double proteinPerUnit, double fatPerUnit, double carbohydratesPerUnit){
		this.name=name;
		this.unitMeasurement=unitMeasurement;
		this.proteinPerUnit=proteinPerUnit;
		this.fatPerUnit=fatPerUnit;
		this.carbohydratesPerUnit=carbohydratesPerUnit;
	}

	//Identify the getName(), getUnit(), getProtein(), getFat(), getCarbs()
	public String getName(){
		return name;
	}

	public String getUnit(){
		return unitMeasurement;
	}

	public double getProtein(){
		return proteinPerUnit;
	}

	public double getFat(){
		return fatPerUnit;
	}

	public double getCarbs(){
		return carbohydratesPerUnit;
	}

	//Identify all the "compute" methods
	public double computeProtein(double quantity){
		return quantity*proteinPerUnit;
	}

	public double computeFat(double quantity){
		return quantity*fatPerUnit;
	}

	public double computeCarbohydrates(double quantity){
		return quantity*carbohydratesPerUnit;
	}

	public double computeCalories(double quantity){
		return quantity*proteinPerUnit*4+quantity*fatPerUnit*9+quantity*carbohydratesPerUnit*4;
	}

	//toString returns the name
	public String toString(){
		return name;
	}

	//nutritionalValues returns the String of quantity, name, protein, fat and carbohydrates
	public String nutritionalValues(double quantity){
		return quantity+" "+getUnit()+" "+getName()+" contains "+computeProtein(quantity)+" "+getUnit()+" of protein, "+computeFat(quantity)+" "+getUnit()+" of fat, and "+computeCarbohydrates(quantity)+" "+getUnit()+" of carbohydrates,for a total of "+computeCalories(quantity)+" calories.";
	}
}

class IngredientDatabase {

	private Ingredient[] ingredients;
	private int numIngredients;

	public IngredientDatabase() {
		ingredients = new Ingredient[100];
		ingredients[0] = new Ingredient("flour", "g", 0.11, 0.012, 0.75);
		ingredients[1] = new Ingredient("milk", "ml", 0.033, 0.038, 0.047);
		ingredients[2] = new Ingredient("oil", "g", 0, 1, 0);
		ingredients[3] = new Ingredient("egg", "unit", 6.15, 5.45, 0);
		ingredients[4] = new Ingredient("sugar", "g", 0, 0, 1);
		ingredients[5] = new Ingredient("butter", "g", 0.005, 0.82, 0);
		ingredients[6] = new Ingredient("cocoa", "g", 0.19, 0.22, 0.12);
		//add 10 new ingredients
		ingredients[7] = new Ingredient("beef","g",0.27,0.24,0);
		ingredients[8] = new Ingredient("chicken","g",0.244,0.216,0.1);
		ingredients[9] = new Ingredient("lamb","g",0.19,0.37,0);
		ingredients[10] = new Ingredient("wine","ml",0,0,0);
		ingredients[11] = new Ingredient("turkey","g",0.29,0.03,0);
		ingredients[12] = new Ingredient("tuna","g",0.25,0.001,0);
		ingredients[13] = new Ingredient("sauce","g",0.01,0,0.25);
		ingredients[14] = new Ingredient("pea","g",0.054,0.004,0.043);
		ingredients[15] = new Ingredient("honey","g",0,0,0.76);
		ingredients[16] = new Ingredient("ham","g",0.18,0.05,0);
		//change numIngredients from 7 to 17
		numIngredients=17;
	}

	//If the names are same, return the Ingredient; if all the names are not equal to the parameter name, return null after the for loop
	public Ingredient findIngredient(String name){
		for(int i=0;i<numIngredients;i++){
			if(ingredients[i].getName().equals(name)){
				return ingredients[i];
			}
		}
		return null;
	}
}

class Recipe{

	private String name;
	private int numIngredients;
	private Ingredient[] list;
	private double[] quantity;

	//identify the constructor
	public Recipe(String name){
		this.name=name;
		numIngredients=0;
		list = new Ingredient[100];
		quantity= new double[100];
	}

	//add the ingredient then change the numIngredients
	public void addIngredient(Ingredient object, double quantity){
		list[numIngredients]=object;
		this.quantity[numIngredients]=quantity;
		numIngredients++;
	}

	//Identify all the "compute" methods, use the "get" methods in the class Ingredient
	public double computeProtein(){
		double result=0;
		for(int i=0;i<numIngredients;i++){
			result+=quantity[i]*list[i].getProtein();
		}
		return result;
	}

	public double computeFat(){
		double result=0;
		for(int i=0;i<numIngredients;i++){
			result+=quantity[i]*list[i].getFat();
		}
		return result;
	}

	public double computeCarbohydrates(){
		double result=0;
		for(int i=0;i<numIngredients;i++){
			result+=quantity[i]*list[i].getCarbs();
		}
		return result;
	}

	public double computeCalories(){
		double result=0;
		for(int i=0;i<numIngredients;i++){
			result+=list[i].computeCalories(quantity[i]);
		}
		return result;
	}

	//use for loop to record the result
	public String toString(){
		String result="";
		for(int i=0;i<numIngredients;i++){
			result+="\n"+quantity[i]+" "+list[i].getUnit()+" of "+list[i].getName();
		}
		return "Recipe of "+name+result;
	}

	//print the total nutritionalValues
	public String nutritionalValues(){
		return "Nutritional values of "+name+":\n"+"Total protein: "+computeProtein()+"\nTotal fat: "+computeFat()+"\nTotal carbohydrates: "+computeCarbohydrates()+"\nTotal calories: "+computeCalories();
	}
}