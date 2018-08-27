package google.challange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BrailTest {

	@Test
	void testBrailConverter1() {
		// arrange
		String test = "code";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "100100101010100110100010";

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testBrailConverter2() {
		// arrange
		String test = "Braille";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000001110000111010100000010100111000111000100010";

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testBrailConverter3() {
		// arrange
		String test = "The quick brown fox jumps over the lazy dog";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";

		// assert
		assertEquals(expected, actual);

	}

	@Test
	void testBrailConverter4() {
		// arrange
		String test = "";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "";
		// assert
		assertEquals(expected, actual);

	}

	// Test case with multiple capital letters
	@Test
	void testBrailConverter5() {
		// arrange
		String test = "The Day Monday";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000001011110110010100010000000000001100110100000101111000000000001101100101010101110100110100000101111";
		// assert
		assertEquals(expected, actual);

	}

	// Test case with spaces
	@Test
	void testBrailConverter7() {
		// arrange
		String test = " ";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000000";
		// assert
		assertEquals(expected, actual);

	}

	// Test case with spaces
	@Test
	void testBrailConverter8() {
		// arrange
		String test = "Today ";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000001011110101010100110100000101111000000";
		// assert
		assertEquals(expected, actual);

	}

	// Test call uppercase
	@Test
	void testBrailConverter9() {
		// arrange
		String test = "TODAY";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000001011110000001101010000001100110000001100000000001101111";
		// assert
		assertEquals(expected, actual);

	}

	// Test uppercase with spaces
	@Test
	void testBrailConverter10() {
		// arrange
		String test = " TODAY ";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000000000001011110000001101010000001100110000001100000000001101111000000";
		// assert
		assertEquals(expected, actual);

	}

	// Test uppercase with spaces
	@Test
	void testBrailConverter11() {
		// arrange
		String test = "todaY";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "011110101010100110100000000001101111";
		// assert
		assertEquals(expected, actual);

	}

	// Test uppercase with spaces
	@Test
	void testBrailConverter12() {
		// arrange
		String test = "to day";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "011110101010000000100110100000101111";
		// assert
		assertEquals(expected, actual);

	}

	// Test uppercase with spaces
	@Test
	void testBrailConverter13() {
		// arrange
		String test = "ttt";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "011110011110011110";
		// assert
		assertEquals(expected, actual);

	}

	// Test uppercase with spaces
	@Test
	void testBrailConverter14() {
		// arrange
		String test = "   ";

		// act
		String actual = BrailConverter.answer(test);
		String expected = "000000000000000000";
		// assert
		assertEquals(expected, actual);

	}

}
