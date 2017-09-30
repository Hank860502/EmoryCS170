public class IsPalindrome{

	public static void main(String[] args){
		System.out.println(isPalindrome("hankn")); // false
		System.out.println(isPalindrome("hanknah")); // true
		System.out.println(isPalindrome("kayak")); // true

	}

	public static boolean isPalindrome(String word){
		int front = 0; // index of first letter
    int back = word.length() - 1; // index of last letter

    while (back > front) { // check until midpoint of the word
      if (word.charAt(front) != word.charAt(back)){
      	// compare the letter from front and letter from behind if they match
      	return false; // if doesn't match, return false, method ends
      }
      front += 1; // move to the next index 
      back -= 1; // move to next index from behind
    }
    return true; // if method never fails which mean every letter counting from the behind martch with those from front, return true
	}
}
