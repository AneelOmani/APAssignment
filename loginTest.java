package assign;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class loginTest {

	@Test
	public void test() {
		Userlogin test1=new Userlogin();
		//assertTrue(test1.check());
		assertFalse(test1.check());        //check the test case 
		
	}

}
