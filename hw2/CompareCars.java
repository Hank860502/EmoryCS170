public class CompareCars{

	public static void main(String[] args){

		System.out.println(compareCars(24));
	}

	public static String compareCars(int years){
		int a = 20000;
		int b = 30000;
		double aGas = 15000 / 25 * 2.50;
		double bGas = 15000 / 32 * 2.50;
	  double aMain = 1300;
		double bMain = 1000;
		double aCost = 0.0;
		double bCost = 0.0;

		for(int i=0; i<years; i++){
			aMain *= 1.15;
			bMain *= 1.10;
			aCost = a + aGas + aMain;
			bCost = b + bGas + bMain;

			System.out.println("Years\tCarA\t\tCarB"); // label of each column, and make the table neater with two \ts
			System.out.println(i+1 + "\t" + String.format("%.2f", aCost) + "\t" + String.format("%.2f", bCost));

		}
		if(aCost > bCost){
			return "Car B";
		} else{
			return "Car A";
			}
	}
}