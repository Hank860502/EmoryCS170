public class LetterCount{

	public static void main(String[] args){
    System.out.println(letterCount("hank", "h")); // 1
    System.out.println(letterCount("aeiouaa", "a")); // 5
		System.out.println(letterCount("", "a")); // 0
    // my cases
    System.out.println(letterCount("abc-123-abc-ABC", "b")); // returns 2 
    System.out.println(letterCount("This is interesting!", "z")); // returns 0 
    System.out.println(letterCount("", "q")); // 0

	}

	public static int letterCount(String s, String c){
    int count = 0;

    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == c.charAt(0)){ // can't compare string with char so I change c to index of 0 
        count += 1; // if the index letter equals c, add 1 to count
      }
    }
    return count;
	}
}
