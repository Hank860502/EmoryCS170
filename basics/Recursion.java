public class Recursion{

	public static void main(String[] args){

		// System.out.println(powerOfTwo(5)); // 
		// System.out.println(factorial(3)); // 
		// System.out.println(reverseString("sdf")); //
		// System.out.println(isPalindrome("sdf")); //
		// System.out.println(isPalindrome("kayak")); //

		int[] x1 = {};
		int[] x2 = {5};
		int[] x3 = {2, 1, 3, 4, 10, 0};
		// System.out.println(sum(x1, x1.length));
		// System.out.println(sum(x2, x2.length));
		// System.out.println(sum(x3, x3.length));
		
		System.out.println(min(x3, x3.length));



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

	public static String reverseString(String s){
		if(s.length() <= 1){
			return s;
		} else {
			return s.substring(s.length()-1) + reverseString(s.substring(0, s.length()-1));
		}
	}

	public static boolean isPalindrome(String s){
		if(s.length() <= 1){
			return true;
		} else {
			return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1, s.length()-1));
		}
	}

	public static int sum(int[] x, int n){
		if(n==0){
			return 0;
		} else {
			return x[n-1] + sum(x, n-1);
		}
	}

	public static int oddCount(int[] x, int n){
		if(n==0){
			return 0;
		} else if(x[n-1] % 2 == 1){
			return 1 + oddCount(x, n-1);
		} else {
			return oddCount(x, n-1);
		}
	}
	
	public static int min(int[] x, int n){
		if(n==1){
			return x[0];
		} else {
			int k = min(x, n-1);
			if(x[n-1] < k){
				return x[n-1];
			} else {
				return k;
			}
		}
	}

	public static int minIndex(int[] x, int n){
		if(n==1){
			return 0;
		} else {
			int k = minIndex(x, n-1);
			if(x[n-1] < x[k]){
				return n-1;
			} else {
				return k;
			}
		}
	}
}