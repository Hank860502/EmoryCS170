public class WithoutDuplicates{

	public static void main(String[] args){
		int[] testA = {1, 2, 3};
		int[] testB = {1, 2, 3, 0, 0};
		int[] testC = {1, 2, 1, 1, 3, 2, 3};
		testA = withoutDuplicates(testA);
		int testALength = testA.length;
		testB = withoutDuplicates(testB);
		int testBLength = testB.length;
		testC = withoutDuplicates(testC);
		int testCLength = testC.length;

		System.out.println(arrayToString(testA, testALength)); // {1, 2, 3}
		System.out.println(arrayToString(testB, testBLength)); // {1, 2, 3, 0}
		System.out.println(arrayToString(testC, testCLength)); // {1, 2, 3}

	}

	public static int[] withoutDuplicates(int[] x){
		int count = 0;
		boolean containsZero = false;

		for(int i=0; i<x.length; i++){
			if(x[i]==0){
			// check if array x includes 0
				containsZero = true;
				// found a 0 count + 1
				count++;
			}
		}

		for(int i=0; i<x.length; i++){
			int testNumber = x[i];
			for(int j=i+1; j<x.length; j++){
				if(x[j]!=0 && x[j]==testNumber){
					// turn duplicated numbers to 0
					x[j]=0;
					// after this, array x becomes an array full of unduplicated numbers and 0s {1,2,0,0,3,0,0}
					count++;
					// everytime found a duplicated number, record it so I can know how many zeros shold I delete
				}
			}
		}
		if(containsZero){
			// if array zontains zero, don't delete all the zero in array after I change all duplicated numbers to 0, keep one 0
			count -= 1;
		}
		int[] store = new int[x.length-count];
		int indexOfStore = 0;
		for(int i=0; i<x.length; i++){
			if(x[i] != 0){
				// add x[i] to store from first index
				store[indexOfStore] = x[i];
				indexOfStore ++;
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