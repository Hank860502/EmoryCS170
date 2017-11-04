public class IsReverse{
	
	public static void main(String arg[]){
		System.out.println(isReverse("happy", "yppah"));
		System.out.println(isReverse("cool", "loac"));
		System.out.println(isReverse("", ""));
	}
	
	public static boolean isReverse(String s1, String s2){
		if (s1.length() == 0 && s2.length() == 0) {
      return true;
    }else if (s1.length() != s2.length()) {
    	// if length is different don't need to check other things
      return false;
    }else {
      char s1first = Character.toLowerCase(s1.charAt(0));
      char s2last = Character.toLowerCase(s2.charAt(s2.length() - 1));
      // check if letter matched
      if (s1first == s2last){
        return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
      }else {
        return false;
      }
  	}
  }
}