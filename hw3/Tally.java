public class Tally{

	public static void main(String[] args){
		int[] test = tally("HEY! Apples and bananas!");
		System.out.println(arrayToString(test, 5)); // {5, 2, 0, 0, 0}

		int[] test2 = tally("sss aaa ee i ldo iwou");
		System.out.println(arrayToString(test2, 5)); // {3, 2, 2, 2, 1}

		int[] test3 = tally("");
		System.out.println(arrayToString(test3, 5)); // {3, 2, 2, 2, 1}
	}

	public static int[] tally(String s){
		// initial an array of 0s
		int[] store = {0, 0, 0, 0, 0};
		// loop through each letter in s
		for(int i=0; i<s.length(); i++){
			// upper case and lower case both count
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A'){
				// count + 1 to corresponding index
				store[0] += 1;
			}
			else if(s.charAt(i) == 'e' || s.charAt(i) == 'E'){
				// count + 1 to corresponding index
				store[1] += 1;
			}
			else if(s.charAt(i) == 'i' || s.charAt(i) == 'I'){
				// count + 1 to corresponding index
				store[2] += 1;

			}
			else if(s.charAt(i) == 'o' || s.charAt(i) == 'O'){
				// count + 1 to corresponding index
				store[3] += 1;

			}
			else if(s.charAt(i) == 'u' || s.charAt(i) == 'U'){
				// count + 1 to corresponding index
				store[4] += 1;
			}
		}	
		return store;		
	}

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