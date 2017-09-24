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
}