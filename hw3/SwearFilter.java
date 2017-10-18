public class SwearFilter{

	public static void main(String[] args){

		String[] test = {"duck", "ship", "whole"};
		System.out.println(swearFilter("A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!", test));
		// A d**k was sailing on a s**p s**pping w***e wheat bread. D**k that S**P!!!

		String[] test2 = {"fuck", "shit", "whole"};
		System.out.println(swearFilter("Fuck, I finally finish this whole SHIT!!!", test2)); // just kidding, I LOVE CS for real
		// F**k, I finally finish this w***e S**T!!!

	}

	public static String swearFilter(String text, String[] swear){
		// create a copy of string and convert to lower case
		String copyText = text;

		for(int i=0; i<swear.length; i++){
			copyText = copyText.toLowerCase();
			String starSwear ="";
			// convert first CHAR in swear word to string by adding to an empty string
			starSwear += swear[i].charAt(0);
			// replace the middle section of swear words with stars using the length of swear word midus 2(first and last letter)
			for(int j=0; j<swear[i].length()-2; j++){
				starSwear += "*";
			}
			// add the last CHAR in swear word to starSwear
			starSwear += swear[i].charAt(swear[i].length()-1);
			copyText = copyText.replace(swear[i], starSwear);
		}
		// take all the indexes of stars in copyText and replace those indexes with stars in original text
		for(int i=0; i<text.length(); i++){
			if(copyText.charAt(i) == '*'){
				text = text.substring(0,i)+ copyText.charAt(i) +text.substring(i+1);
			}
		}
		return text;
	}
}