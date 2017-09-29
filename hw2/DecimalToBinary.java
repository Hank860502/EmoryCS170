public class DecimalToBinary{
	public static void main(String[] arg){

		System.out.println(decimalToBinary(23));

	}

	public static String decimalToBinary(int n){
		String result = "";
		int a = n;
		for(;a>0; a/=2){
			if(a<2){
				result += "1";
			} else if(a%2 == 0){
				result += "0";
			} else if(a % 2 != 0){
				result += "1";
			}
		}
		while (result.length()<8){
			result += "0";
		}
		String reverse = "";
		
		for(int i=result.length() -1 ; i>=0; i--){
			reverse+=result.charAt(i);
		}

		return reverse;
	}

}