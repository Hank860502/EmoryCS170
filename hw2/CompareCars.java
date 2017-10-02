// Task 2:
	// Since before the 9th year, car A is cheaper in total cost than car B; I would buy car A if I were to keep it for 5 years. However, I would buy car B if I were to keep it more than 9 years.
// Task 3: what is the difference between printing something and returning it?
	// Although they might look similar on the termainal, but printing something is simply leaving some notes on the terminal, and the method will not store any value. Whereas returning will actually store the result of the method and the result can be used repeatedly.

public class CompareCars{

	public static void main(String[] args){

		System.out.println(compareCars(24));
	}

	public static String compareCars(int years){
		int a = 20000;
		int b = 30000;
		double aGas = 15000 / 25 * 2.50; // annual gas cost
		double bGas = 15000 / 32 * 2.50; // annual gas cost
	  double aMain = 1300; // to get the mmaintence fee for each year
		double bMain = 1000;
		double aCost = 0.0;
		double bCost = 0.0;
		double storeAMain = 1300; // to accumlate the total cost of maintenece fee
		double storeBMain = 1000;

		System.out.println("Years\tCarA\t\tCarB"); // label of each column, and make the table neater with two \ts
		System.out.println("0\t20000.00\t30000.00"); // only the price of the car in year 0 
		for(int i=1; i<=years; i++){
			if(i==1){
				// there is no growth for maintenence fee in the FIRST year so use original price
			}else {
				storeAMain += aMain *= 1.15; 
				storeBMain += bMain *= 1.10;
			}
			aCost = a + aGas*i + storeAMain; // cost of car plus accumlative gas fee plus accumlative maintenence fee (Got stucked here for two hours because I forgot to accumlae the maintenence fee...)
			bCost = b + bGas*i + storeBMain;

			System.out.println(i + "\t" + String.format("%.2f", aCost) + "\t" + String.format("%.2f", bCost));

		}
		if(aCost > bCost){
			// in each year, compare which car is cheaper in total
			return "Car B";
		} else{
			return "Car A";
			}
	}
}