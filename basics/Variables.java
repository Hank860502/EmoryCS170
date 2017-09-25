public class Variables{
	public static void main(String[] arg){
		// System.out.println(multN(4));
		// System.out.println(multiplyString("hank", 4));
		// System.out.println(multiplyString("hank", 8));
	int a = 2;
	double b = 2.0;
	String c = "2";
	// System.out.println(c*a+a);
	System.out.println(c + a*a);
  System.out.println(giveCandies(5, 2));
  System.out.println(sumN(5));
  System.out.println(sumN(3));
	
	}

  public static String giveCandies(int candies, int students) {
      return "I have " + candies + " candies. I can give "
              + (candies / students) + " candies to each student and have "
              + (candies % students) + " left.";
  }
  
	public static int multN(int n){
		int result = 1;
		for(int i=1; i<=n; i++){
			result = result*i;
		}
		return result;
	}	

	public static String multiplyString(String s, int n){
		String x = "";
		for(int i=0; i<n; i++){
			x += s;
		}
		return x;
	}

	public static int sumN(int n){
		int i = 0;
		int result = 0;	
		while(i<=n){
			result += i;
			i++;
		}
		return result;
	}
}