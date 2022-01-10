package day01;

import org.junit.jupiter.api.Test;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class RunningFileManagerTest {

	@Test
	void readAllLinesTest() {
		RunningFileManager rfm = new RunningFileManager();
		String fileName = "src/main/resources/running.csv";
		rfm.readAllLines(fileName);
//		System.out.println(rfm.sumOfMonthAndYear(2021, Month.DECEMBER));
		assertEquals(41.2, rfm.sumOfMonthAndYear(2021, Month.DECEMBER));
	}
}