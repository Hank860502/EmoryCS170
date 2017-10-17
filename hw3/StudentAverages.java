public class StudentAverages{

	public static void main(String[] args){

		int[][] class1 = {{50,100,0}, {100,100,80}};
		double[] test = studentAverages(class1);
		System.out.println(arrayToString(test, test.length));

		int[][] class2 = {{35,100,0}, {100,0,80}};
		double[] test2 = studentAverages(class2);
		System.out.println(arrayToString(test2, test2.length));


	}

	public static double[] studentAverages(int[][] x){
		double[] store = new double[x.length];
		for(int student=0; student<x.length; student++){
			// loop through how many students by using x.length
			for(int grade=0; grade<x[student].length; grade++){
				// add all the scores of a student to the corresponding inex of store
				// student 1 has it's total score at store[0], and to get average, divide store[0] by the length of grade
				store[student] += x[student][grade];
			}
		}
		// divide the total score by how many grades they took
		for(int i=0; i<x.length; i++){
			// devide the score of each student by the amount of quizes they took
			store[i] = store[i]/x[i].length;
		}
		return store;
	}

	// changed the parameter int[] a to double 
	public static String arrayToString(double[] a, int n) {
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