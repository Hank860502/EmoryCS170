public class SumOfDiffs{

	public static void main(String[] args){

		System.out.println(sumOfDiffs(new int[]{3, 4, 5})); // -2
		System.out.println(sumOfDiffs(new int[]{4, 1, 19, 6})); // -2
		System.out.println(sumOfDiffs(new int[]{})); // 0
		System.out.println(sumOfDiffs(new int[]{3, 0, -1})); // 4
	}

	public static int sumOfDiffs(int[] x){
		int store = 0;
		if(x.length==0){
			return 0;
		}
		int i=0;
		// Suddenly feels like using while loop so I do it this way!
		// each index of array
		while(i<x.length-1){
			// add the substraction of two elements to my variable store
			store += x[i] - x[i+1];
			i+=1; // loop moves on
		}
		return store;
	}

}