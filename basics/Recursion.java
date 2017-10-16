public class Recursion{

	public static void main(String[] args){

		System.out.println(powerOfTwo(5)); // 
		System.out.println(factorial(3)); // 
	}

	public static int powerOfTwo(int n){
		if(n == 0){
			return 1;
		} else {
			return 2 * powerOfTwo(n-1);
		}
	}
	// 0! = 1
	// 3! = 3 * 2 * 1
	public static int factorial(int n){
		if(n == 0){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}