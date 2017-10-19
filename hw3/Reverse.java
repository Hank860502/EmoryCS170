public class Reverse{

	public static void main(String[] args){
		int[] testA = {1, 2, 3};
		int[] testB = {1, 2, 3, 0, 0};
		int[] testC = {1, 2, 1, 1, 3, 2, 3};

		System.out.println(arrayToString(testA, 3)); // {1, 2, 3}
		reverse(testA);
		System.out.println(arrayToString(testA, 3)); // {3, 2, 1}

		System.out.println(arrayToString(testB, 5)); // {1, 2, 3, 0, 0}
		reverse(testB);
		System.out.println(arrayToString(testB, 5)); // {0, 0, 3, 2, 1}

		System.out.println(arrayToString(testC, 7)); // {1, 2, 1, 1, 3, 2, 3}
		reverse(testC);
		System.out.println(arrayToString(testC, 7)); // {3, 2, 3, 1, 1, 2, 1}


reverse(testC); // {1, 2, 3}

	}

	public static void reverse(int[] x){
		// reverse half of the array
		for(int i=0; i<x.length/2; i++){
			// store the first index of x
	    int store = x[i];
	    // replace the first index of x with the last index
	    x[i] = x[x.length-i-1];
	    // replace the last index with what we store, which finish the swap
	    x[x.length-i-1] = store;
		}
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