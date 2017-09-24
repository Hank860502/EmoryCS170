public class Math{
	public static void main(String[] arg){

		// problem (a)
		System.out.println(sumOfSquares(4)); // 30
		System.out.println(sumOfSquares(0));

		// problem (b)
		System.out.println(product(0,3)); // 0
		System.out.println(product(5,3)); // 15
		System.out.println(product(5,4)); // 20

		// problem (c)
		System.out.println(compoundInterest(1000, 0.05, 3)); // 1157.625
		System.out.println(compoundInterest(1000, 0.08, 2)); // 1166.4

		// problem(d)
		System.out.println();		

	}

	public static int sumOfSquares(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			sum += i*i;
		}
		return sum;
	}

	public static int product(int x, int y){
		int sum=0;
		for(int i=0; i<y; i++){
			sum += x;
		}
		return sum;
	}

	public static double compoundInterest(double money, double interestRate, int years){
		double sum=1;
		for(int i=0; i<years; i++){
			sum *= (1+interestRate);
			// this gives a weird long decimal number...
		}
		return 1000*sum;
	}
}