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
		System.out.println(testA.length); // {1, 2, 3}

	}

	public static int[] withoutDuplicates(int[] x){
		int n = 1;
		int[] store = new int[n];
		if(x.length == 0 || x.length == 1){
        return x;
    }
		else if(x.length>1){
			store[0] = x[0]; // add first index of x to an empty array

			for(int i=1; i<x.length; i++){
				for(int j=0; j<store.length; j++){
					if(x[i] != store[j]){ // if the second index of x not equal to the one in store already, add in to store
						store[n] = x[i]; // add x[i] to an empty array
						n++;
					}
				}
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