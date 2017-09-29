public class Storyteller{
	public static void main(String[] arg){
		System.out.println(storyteller("Alice", "Betsy", "dresses", 10, "Davide", "Hank", "stone age"));
	}

	public static String storyteller(String girl1, String girl2, String posession, int quantity, String user, String teller, String time){
		String magic = girl1.charAt(girl1.length() - 1) + "aa" + girl1.charAt(0) + " " + girl2.charAt(girl2.length() - 1) + "ee" + girl2.charAt(0) +" " + posession.charAt(posession.length() - 1) + "ii" + posession.charAt(0) + "! ";
		magic = magic.toLowerCase();
		String magic1 = magic.substring(0, 1).toUpperCase() + magic.substring(1);; // upper the first letter of the magic word useing substring method
		String capitalMagic = magic.toUpperCase(); // upper all the letters in the magic word

		String story = "Hello " + user + ", my name is " + teller + " and today I am going to tell you a story happened in the " + time + ". " + girl1 + " was a beautiful princess. Betsy was a wicked witch. " + quantity + " expensive " + posession + ", whereas" + girl2 + " had only " + quantity/2 +	". Because of envy, " + girl2 + "  cast a spell on " + girl1 + ", yelling these arcane magical words: '" + magic1 + capitalMagic + "Suddenly, " + girl1 + "'s " + quantity + posession + " turned into rugs. " + girl1 + " became very unhappy. Seeing that " + girl1 + " was unhappy, " + girl2 + " realized she was wrong, and reversed the spell. " + girl1 + " and " + girl2 + " became friends, and they lived happily ever after.";

		return story;
	}
}