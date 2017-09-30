public class WordCount{

	public static void main(String[] args){
    
    System.out.println(wordCount("sddfddsfdf")); // 1
    System.out.println(wordCount("sdfdsf sdf sdf sdf sd sdf ? ")); // 7
		System.out.println(wordCount("     ")); // 0
    // my tests
    
    System.out.println(wordCount("This is a test")); // 4
    System.out.println(wordCount("This    is    a    test!!!!!")); // 4
    System.out.println(wordCount("")); // 0
    System.out.println(wordCount("Wahoo42!??!?!")); // 1

	}

	public static int wordCount(String word){
    int count = 0;

    if(word == null){
      return count;
    }
    // check if the string is empty
    for(int i = 0; i < word.length(); i++){
      if(word.charAt(i) != ' '){
        count++; // if there is a letter in parameter word, count + 1
        while(word.charAt(i) != ' ' && i < word.length()-1){
          i++; // while the letter is not a space or we have reach the last letter, keep adding 1 to i to skip letters in the same word
        }
      }
    }
    return count;
  }
}
