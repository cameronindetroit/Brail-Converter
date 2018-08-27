package google.challange;

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

public class BrailConverter {

	public static void main(String[] args) {

		answer("   ");

	}

	public static String answer(String plaintext) {

		// Converted String
		String convertedString = "";
		String lowerCase = "";
		String convertSpaces = "";
		String upperCaseLetters = "";
		String lowerCaseLetters = "";
		String fullString = "";
		String parameter = plaintext.replaceAll(" ", "2");
		int paramLength = parameter.length();

		// Array that has all letters of alphabet in braille in order , space annotation
		// and
		// capitalization

		String[] brailleAlphabet = { "100000", "110000", "100100", "100110", "100010", "110100", "110110", "110010",
				"010100", "010110", "101000", "111000", "101100", "101110", "101010", "111100", "111110", "111010",
				"011100", "011110", "101001", "111001", "010111", "101101", "101111", "101011", "000001", "000000" };

		// Loop to check for capitalization and convert to braille
		for (int i = 0; i < paramLength; i++) {

			// Condition to apply upperCase braille notation
			if (Character.isUpperCase(parameter.charAt(i))) {

				upperCaseLetters = brailleAlphabet[26] + parameter.toLowerCase().charAt(i);

				fullString += upperCaseLetters;

			} else {

				lowerCaseLetters = String.valueOf(parameter.charAt(i));
				fullString += lowerCaseLetters;

			}
		}

		// condition to check for letters of alphabet
		if (fullString.contains("a") || fullString.contains("b") || fullString.contains("c") || fullString.contains("d")
				|| fullString.contains("e") || fullString.contains("f") || fullString.contains("g")
				|| fullString.contains("h") || fullString.contains("i") || fullString.contains("j")
				|| fullString.contains("k") || fullString.contains("l") || fullString.contains("m")
				|| fullString.contains("n") || fullString.contains("o") || fullString.contains("p")
				|| fullString.contains("q") || fullString.contains("r") || fullString.contains("s")
				|| fullString.contains("t") || fullString.contains("u") || fullString.contains("v")
				|| fullString.contains("w") || fullString.contains("x") || fullString.contains("y")
				|| fullString.contains("z") || fullString.contains("2")) {

			// Convert all letters to braille characters and (2) to (-)
			convertedString = fullString.replace("a", brailleAlphabet[0]).replace("b", brailleAlphabet[1])
					.replace("c", brailleAlphabet[2]).replace("d", brailleAlphabet[3]).replace("e", brailleAlphabet[4])
					.replace("f", brailleAlphabet[5]).replace("g", brailleAlphabet[6]).replace("h", brailleAlphabet[7])
					.replace("i", brailleAlphabet[8]).replace("j", brailleAlphabet[9]).replace("k", brailleAlphabet[10])
					.replace("l", brailleAlphabet[11]).replace("m", brailleAlphabet[12])
					.replace("n", brailleAlphabet[13]).replace("o", brailleAlphabet[14])
					.replace("p", brailleAlphabet[15]).replace("q", brailleAlphabet[16])
					.replace("r", brailleAlphabet[17]).replace("s", brailleAlphabet[18])
					.replace("t", brailleAlphabet[19]).replace("u", brailleAlphabet[20])
					.replace("v", brailleAlphabet[21]).replace("w", brailleAlphabet[22])
					.replace("x", brailleAlphabet[23]).replace("y", brailleAlphabet[24])
					.replace("z", brailleAlphabet[25]).replace("2", "-");

		}

		// Replace any (-) with proper braille notation
		convertSpaces = convertedString.replaceAll("-", brailleAlphabet[27]);

		// Form output String
		convertedString = lowerCase + convertSpaces;

		// output converted string to console to test
		System.out.println(convertedString);

		// return convertedString
		return convertedString;
	}

}
