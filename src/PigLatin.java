import java.util.ArrayList;
import java.util.Arrays;

public class PigLatin {

	public static String translate(String s) {
		// here declaring a list of characters that are approved in our strings. eg:
		// alphabets in both cases and punctuation marks ans spaces
		ArrayList<Character> approvedChars = new ArrayList<Character>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g',
				'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B',
				'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z', '.', '?', '"', ',', '-', '_', '!', ':', ':', '(', ')', '[', ']', '/', ' ', '\''));
		// looping through the string to check if there is any character that aren't
		// approved
		for (int i = 0; i < s.length(); i++) {
			// if there is any character that isn't present in the approvedChars list then
			// we are returning the input string as it is.
			if (!approvedChars.contains(s.charAt(i))) {
				// System.out.println(s);
				return s;
			}
		}
		// here we comes only after ensuring that all the characters in the input string
		// are approved.
		// splitting the string into words based on spaces if there exists more than one
		// word and storing them in an array named words
		String[] words = s.split(" ");
		// by uncommenting the next line you can check if the sentence get splitted into
		// words or not
		// for (String word : words) System. out. println(word);
		// declaring the variable in which we are going to store the final result
		String finalAns = "";
		// looping through words array to convert them into piglatin word
		for (int i = 0; i < words.length; i++) {
			// storing each word in s and converting s into piglatin word
			s = words[i];
			// checking if the first letter is vowel or not. if it is then directly adding
			// "way" at the end of the word.
			if (s.toLowerCase().charAt(0) == 'a' || s.toLowerCase().charAt(0) == 'e' || s.toLowerCase().charAt(0) == 'i'
					|| s.toLowerCase().charAt(0) == 'o' || s.toLowerCase().charAt(0) == 'u') {
				s = s + "way";
			} else {
				int index = 0;
				String add = "";
				String ans = "";
				// if the first letter is not a vowel then we are storing the characters untill
				// we get the first vowel in add string variable
				while ((s.toLowerCase().charAt(index) != 'a' && s.toLowerCase().charAt(index) != 'e'
						&& s.toLowerCase().charAt(index) != 'i' && s.toLowerCase().charAt(index) != 'o'
						&& s.toLowerCase().charAt(index) != 'u') && index < s.length()) {
					add += s.charAt(index);
					index++;
				}
				// we are storing the characters after we get our first vowel inclusive the
				// vowel in ans string variable
				for (int j = index; j < s.length(); j++) {
					ans += s.charAt(j);
				}
				// then adding the add variable after the ans varuable and then adding "ay"
				ans += add;
				s = ans;
				s += "ay";
			}
			// checking if the word we are adding to the finalAns is the first word or not.
			// as if there exists more than one word in output we
			// want spaces after each word. so if it is not the first word then we are
			// adding a space in the finalAns and then adding the converted word.As if input
			// is given as a sentence , we also have to output or return as a sentence.
			if (i != 0)
				finalAns += " ";
			finalAns += s;
		}
		// by uncommenting the next line you can check the final output
		// System.out.println(finalAns);
		return finalAns;
	}

	public static void main(String[] args) {

	}
}
