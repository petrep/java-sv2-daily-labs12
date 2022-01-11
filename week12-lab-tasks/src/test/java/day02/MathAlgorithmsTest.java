package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

	@Test
	void greatestCommonDivisorTest() {
		MathAlgorithms mathAlgorithms = new MathAlgorithms();
		assertEquals(6, mathAlgorithms.greatestCommonDivisor(24, 18));
	}

	@Test
	void greatestCommonDivisorWhileTest() {
		MathAlgorithms mathAlgorithms = new MathAlgorithms();
		assertEquals(6, mathAlgorithms.greatestCommonDivisorWhile(24, 18));
	}
}