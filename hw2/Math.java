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
		System.out.println(polySpiralLength(3, 10, 5)); 
		System.out.println(polySpiralLength(5, 10, 4));


	}

	public static int sumOfSquares(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			// i needs to start from 1 because we are counting the sum from 1
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
		// formula of compound interest is money * (interesRtate power of years)
		double sum= money;

		for(int i=0; i<years; i++){
			sum *= (1+interestRate);
			// instead of using interestRate.pow(3), times itself three times using a loop and store it as sum
			// this gives a weird long decimal number...
		}
		return sum; // retrun the compoundInterest  
	}

	public static double polySpiralLength(int n, double base, int rounds){
		// since base is double, method should be declare as a double
		double sum = 0;

	  for(int i=0; i<rounds*n; i++){
	  	// using the previous code and remove the rotation part
      sum+=((i + 1) * base);
      // add all turtle forward value to sum
    }
    return sum;
	}
}