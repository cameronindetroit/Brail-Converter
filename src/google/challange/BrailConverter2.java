package google.challange;

import java.util.HashMap;
import java.util.Map;

/*
 * I solved this problem by using an array to hold all braille characters in the alphabet,
 *  including space and capitalization. My original thought was to use a Hash map to save as key value pairs 
 *  to make it easier to read and understand. Because I'm not adding or taking away from the list
 *   I decided to leave it as an array. 
 *   
 *   I also left the conditions very simple and stayed away from regular expressions in my first condition
 *   to show a full range of the alphabet. The rest of the code is pretty simple and straight to the point.
 *   
 *    I used my own test cases in the IDE using TDD to test the examples you gave in the code challenge
 *    and all test cases checked out. 
 */

public class BrailConverter2 {

	public static void main(String[] args) {

		answer("The quick brown fox jumps over the lazy dog");
		answer("code");
		answer("Braille");

	}

	public static String answer(String plaintext) {

		// Converted String
		String convertedString = "";
		String lowerCase = "";
		String noSpaces = "";

		// Map to hold braille alphabet
		Map<String, String> brailleAlphabet = new HashMap<>();

		brailleAlphabet.put("a", "100000");
		brailleAlphabet.put("b", "110000");
		brailleAlphabet.put("c", "100100");
		brailleAlphabet.put("d", "100110");
		brailleAlphabet.put("e", "100010");
		brailleAlphabet.put("f", "110100");
		brailleAlphabet.put("g", "110110");
		brailleAlphabet.put("h", "110010");
		brailleAlphabet.put("i", "010100");
		brailleAlphabet.put("j", "010110");
		brailleAlphabet.put("k", "101000");
		brailleAlphabet.put("l", "111000");
		brailleAlphabet.put("m", "101100");
		brailleAlphabet.put("n", "101110");
		brailleAlphabet.put("o", "101010");
		brailleAlphabet.put("p", "111100");
		brailleAlphabet.put("q", "111110");
		brailleAlphabet.put("r", "111010");
		brailleAlphabet.put("s", "011100");
		brailleAlphabet.put("t", "011110");
		brailleAlphabet.put("u", "101001");
		brailleAlphabet.put("v", "111001");
		brailleAlphabet.put("w", "010111");
		brailleAlphabet.put("x", "101101");
		brailleAlphabet.put("y", "101111");
		brailleAlphabet.put("z", "101011");

		// Array to hold capitalization braille string and space braille string.
		String[] brailAlphabetArray = { "000001", "000000" };

		// condition to handle empty string
		if (plaintext.equals("")) {

			return plaintext;
		}

		// Condition to check for capitalization and convert to braille
		if (Character.isUpperCase(plaintext.charAt(0))) {

			plaintext = plaintext.toLowerCase();

			lowerCase = brailAlphabetArray[0];

		}

		// condition to check for letters of alphabet
		if (plaintext.contains("a") || plaintext.contains("b") || plaintext.contains("c") || plaintext.contains("d")
				|| plaintext.contains("e") || plaintext.contains("f") || plaintext.contains("g")
				|| plaintext.contains("h") || plaintext.contains("i") || plaintext.contains("j")
				|| plaintext.contains("k") || plaintext.contains("l") || plaintext.contains("m")
				|| plaintext.contains("n") || plaintext.contains("o") || plaintext.contains("p")
				|| plaintext.contains("q") || plaintext.contains("r") || plaintext.contains("s")
				|| plaintext.contains("t") || plaintext.contains("u") || plaintext.contains("v")
				|| plaintext.contains("w") || plaintext.contains("x") || plaintext.contains("y")
				|| plaintext.contains("z")) {

			// Convert all letters to braille characters
			convertedString = plaintext.replace("a", brailleAlphabet.get("a")).replace("b", brailleAlphabet.get("b"))
					.replace("c", brailleAlphabet.get("c")).replace("d", brailleAlphabet.get("d"))
					.replace("e", brailleAlphabet.get("e")).replace("f", brailleAlphabet.get("f"))
					.replace("g", brailleAlphabet.get("g")).replace("h", brailleAlphabet.get("h"))
					.replace("i", brailleAlphabet.get("i")).replace("j", brailleAlphabet.get("j"))
					.replace("k", brailleAlphabet.get("k")).replace("l", brailleAlphabet.get("l"))
					.replace("m", brailleAlphabet.get("m")).replace("n", brailleAlphabet.get("n"))
					.replace("o", brailleAlphabet.get("o")).replace("p", brailleAlphabet.get("p"))
					.replace("q", brailleAlphabet.get("q")).replace("r", brailleAlphabet.get("r"))
					.replace("s", brailleAlphabet.get("s")).replace("t", brailleAlphabet.get("t"))
					.replace("u", brailleAlphabet.get("u")).replace("v", brailleAlphabet.get("v"))
					.replace("w", brailleAlphabet.get("w")).replace("x", brailleAlphabet.get("x"))
					.replace("y", brailleAlphabet.get("y")).replace("z", brailleAlphabet.get("z"));

		}

		// Replace any whitespace with proper braille annotations
		noSpaces = convertedString.replaceAll("\\s+", brailAlphabetArray[1]);

		// Form output String
		convertedString = lowerCase + noSpaces;
		// output converted string to console to test
		System.out.println(convertedString);

		// return convertedString
		return convertedString;
	}

}
