public class LuhnCheckSum{

	public static void main(String[] args){
		int[] testA = {4,5,6,3,9,2};
		int[] testB = {4,9,9,1,6,5,7};

		System.out.println(luhnCheckSum(testA)); // 30
		System.out.println(luhnCheckSum(testB)); // 40

	}

	public static int luhnCheckSum(int[] x){
		// create store that has same length of x and add the the numbers to store from the last
		// String store = "";
		int result = 0;

		for(int i=0; i<x.length; i++){
			if(i%2 == 0){
				// times 2 when index is even number 
				// add the integer to result
				if(x[i]*2 > 9){
					// if number times two is a two digit number, add 1 to result and add the second digit to result by % 10
					result += 1;
					result += (x[i] * 2) % 10;
				} else {
					result += x[i]*2;
				}

			} else {
				// if it's at odd index, just add it to result
				result += x[i];
			}
		}
		return result;
	}





  // convet array to string
  public static String arrayToString(int[] a, int n) {
    String result = "[";
    for (int i = 0; i < n - 1; i++) {
        result = result + a[i] + ", ";
    }
    if (n > 0) {
        result = result + a[n - 1];
    }
    result += "]";
    return result;
	}
}