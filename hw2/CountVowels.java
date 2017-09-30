public class CountVowels{

	public static void main(String[] args){
    System.out.println(countVowels("hank")); // 1
		System.out.println(countVowels("aeiou")); // 5

	}

	public static int countVowels(String s){
    int count = 0;

    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
        count += 1; // if the index letter equals to any vowels, add 1 to count
      }
    }
    return count;
	}
}
