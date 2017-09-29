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
  System.out.println(yearsToTarget(1000, 0.05, 2000)); // 15
  System.out.println(breakEvenQuality(1, 0.5, 1000)); // 2000
  System.out.println(breakEvenQuality(1, 0.7, 1000)); // 3334
  System.out.println(mySubstring("hank natt", 1, 5)); // 3334
  System.out.println(reverse("hank natt")); // 3334
  System.out.println(mergeStrings("hank", "nat")); // 3334

	
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

	public static int yearsToTarget(double initMoney, double interestRate, double targetMoney){
		int year = 0;
		while(initMoney <= targetMoney){
			year++;
			initMoney *= 1+interestRate;
		}
		return year;
	}

	public static int breakEvenQuality(double p, double c, double k){
		int unit=0;
		while (k+unit*c > unit*p) {
			unit ++;
		}
		return unit;
	}

	public static String mySubstring(String s, int start, int end){
		String store = "";
		for(int i=start; i<end; i++){
			store+=s.charAt(i);
		}
		return store;
	}

	public static String reverse(String s){
		String store = "";
		for(int i=s.length() -1 ; i>=0; i--){
			store+=s.charAt(i);
		}
		return store;
	}

	public static String mergeStrings(String s1, String s2){
		String store = "";
		int i;
		for(i=0; i<s1.length(); i++){
			store+=s1.charAt(i);
			store+=s2.charAt(i);
		}
		for(;i<s2.length(); i++){
			store+=s2.charAt(i);
		}
		
		return store;
	}
}





