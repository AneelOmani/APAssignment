package assign;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Quiz1 {

	@Test
	public void test() throws IOException {
		Quizattempt test1=new Quizattempt();
		//assertTrue(test1.check());
		assertFalse(test1.check());  //check weather strings or null
	}

}
