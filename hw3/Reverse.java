public class Reverse{

	public static void main(String[] args){
		int[] testA = {1, 2, 3};
		int[] testB = {1, 2, 3, 0, 0};
		int[] testC = {1, 2, 1, 1, 3, 2, 3};
		testA = reverse(testA);
		testB = reverse(testB);
		testC = reverse(testC);


		System.out.println(arrayToString(testA, 3)); // {1, 2, 3}
		System.out.println(arrayToString(testB, 5)); // {1, 2, 3, 0}
		System.out.println(arrayToString(testC, 7)); // {1, 2, 3}

	}

	public static void reverse(int[] x){
		for(int i=0; i<x.length/2; i++){
	    int temp = x[i];
	    x[i] = x[x.length-i-1];
	    x[x.length-i-1] = temp;
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