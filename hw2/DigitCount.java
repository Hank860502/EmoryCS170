public class DigitCount{

	public static void main(String[] args){
    System.out.println(digitCount(123, 3)); // 1
		System.out.println(digitCount(3434, 4)); // 2
    // my tests
    System.out.println(digitCount(456234, 8)); // 0
    System.out.println(digitCount(456234, 5)); // 1
    System.out.println(digitCount(456234, 4)); // 2
	}

	public static int digitCount(int tested, int tester){
    int count = 0;
      while(tested > 0) {
        int lastDigit = tested % 10; // using the modulo to get the last digit of the number
        if(tester == lastDigit){ // check if the tester matches the last digit
          count += 1;
        }
        tested /= 10; // divide the tested by 10 to move on to the second last digit...
      }
    return count;
  }
}
