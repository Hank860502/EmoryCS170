public class CountVowels{

	public static void main(String[] args){
    System.out.println(countVowels("hank")); // 1
		System.out.println(countVowels("aeiou")); // 5

	}

	public static int countVowels(String word){
    int count = 0;

    for(int i=0; i<word.length(); i++){
      if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
        count += 1; // if the index letter equals to any vowels, add 1 to count
      }
    }
    return count;
	}
}
