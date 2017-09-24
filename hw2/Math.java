public class Math{
	public static void main(String[] arg){

		System.out.println(sumOfSquares(4)); // 30
		System.out.println(sumOfSquares(0));
	}

	public static int sumOfSquares(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			sum += i*i;
		}
		return sum;
	}
}