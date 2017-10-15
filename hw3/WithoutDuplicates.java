public class WithoutDuplicates{

	public static void main(String[] args){
		int[] testA = {1, 2, 3};
		int[] testB = {1, 2, 1, 1, 3, 2, 3};
		testA = withoutDuplicates(testA);
		int testALength = testA.length;
		testB = withoutDuplicates(testB);
		int testBLength = testB.length;

		System.out.println(arrayToString(testA, testALength)); // {1, 2, 3}
		System.out.println(arrayToString(testB, testBLength)); // {1, 2, 3}

	}

	public static int[] withoutDuplicates(int[] x){
		int[] store = {};
		if(x.length>0){
			// each index of array
			for(int i=0; i<store.length; i++){
				// add the length of each index to store
				
			}
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