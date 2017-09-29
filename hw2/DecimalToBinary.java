public class DecimalToBinary{
	public static void main(String[] arg){

		System.out.println(decimalToBinary(23));
		System.out.println(decimalToBinary(224));

	}

	public static String decimalToBinary(int n){
		String result = ""; // store the result
		int a = n; // don't want to change the initial value n
		for(;a>0; a/=2){ // a/=2 because we will add 1 or 0 on the new quotient
			if(a<2){
				result += "1"; 
				// if the quotient is less than 2, add 1 and the loop comes to an end because it will fail the for statement a>0 next time around
			} else if(a%2 == 0){
				result += "0";
				// if there is no remainder, add 0 to string result
			} else if(a % 2 != 0){
				result += "1";
				// if there is remainder, add 1 to string result
			}
		}
		while (result.length()<8){
			result += "0";
			// if the result is not yet a 8 digit number, add 0 until it's a 8 digit
		}
		String reverse = "";
		// since i was adding numbers to result from the behind, i need to reverse it to get the correct binary
		
		for(int i=result.length() -1 ; i>=0; i--){
			reverse+=result.charAt(i);
		}

		return reverse;
	}

}