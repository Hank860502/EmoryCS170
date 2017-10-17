public class ReverseCopy{

	public static void main(String[] args){
		int[] testA = {1, 2, 3};
		int[] testB = {1, 2, 3, 0, 0};
		int[] testC = {1, 2, 1, 1, 3, 2, 3};
		testA = reverseCopy(testA);
		int testALength = testA.length;
		testB = reverseCopy(testB);
		int testBLength = testB.length;
		testC = reverseCopy(testC);
		int testCLength = testC.length;

		System.out.println(arrayToString(testA, testALength)); // {1, 2, 3}
		System.out.println(arrayToString(testB, testBLength)); // {1, 2, 3, 0}
		System.out.println(arrayToString(testC, testCLength)); // {1, 2, 3}

	}

	public static int[] reverseCopy(int[] x){
		// create store that has same length of x and add the the numbers to store from the last
		int[] store = new int[x.length];
		int storeIndex = 0;
		for(int i=x.length-1; i>=0; i--){
			store[storeIndex] = x[i];
			storeIndex ++;
		}
		return store;
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