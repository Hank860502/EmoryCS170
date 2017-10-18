public class Recursion{

	public static void main(String[] args){

		System.out.println(powerOfTwo(5)); // 
		System.out.println(factorial(3)); // 
		System.out.println(reverseString("sdf")); //
		System.out.println(isPalindrome("sdf")); //
		System.out.println(isPalindrome("kayak")); //

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
	
}