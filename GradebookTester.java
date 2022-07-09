import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook t1;
	GradeBook t2;
	@BeforeEach
	void setUp() throws Exception {
		//creates 2 GradeBook objects with 5 as parameter
		t1 = new GradeBook(5);
		t2 = new GradeBook(5);
		
		//calls addscore method twice on both objects
		t1.addScore(0);
		t1.addScore(10);
		t2.addScore(5);
		t2.addScore(20);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//sets both objects to null after run
		t1 = null;
		t2 = null;
		
	}

	@Test
	void testAddScore() {
		//tests to make sure toString returns the right output 
		assertTrue(t1.toString().equals("0.0 10.0 ") && t2.toString().equals("5.0 20.0 "));
		
		// makes sure getScoreSize equals the right output
		assertEquals(t1.getScoreSize(), 2.0);
		assertEquals(t2.getScoreSize() , 2.0);
		
		
	}

	@Test
	void testSum() {
		// makes sure sumequals the right output
		assertEquals(t1.sum() ,10.0 );
		assertEquals(t2.sum() , 25.0);
		
		
	}

	@Test
	void testMinimum() {
		// makes sure minimum equals the right output

		assertEquals(t1.minimum(), 0.0 );
		assertEquals(t2.minimum() , 5.0);
		
	
	}

	@Test
	void testFinalScore() {
		// makes sure finalScore equals the right output

		assertEquals(t1.finalScore(), 10.0);
		assertEquals(t2.finalScore(), 20.0);
		
		
	}


}
