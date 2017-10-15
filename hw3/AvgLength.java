
public class AvgLength{

	public static void main(String[] args){

		System.out.println(avgLength(new String[]{"Hello", "Q"})); // 3.0
		System.out.println(avgLength(new String[]{})); // 0.0
		System.out.println(avgLength(new String[]{"Hello", "Goodbye"})); // 6.0

	}

	public static double avgLength(String[] x){
		int store = 0;
		if(x.length==0){
			return 0.0;
		}
		// each index of array
		for(int i=0; i<x.length; i++){
			// add the length of each index to store
			store += x[i].length();
		}
		// return the result of total length of each index divided by the length of x
		return store/x.length;
	}

}