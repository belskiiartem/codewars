package validPhoneNumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {
	  
	@Test
	  public void tests() {
	    assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
	    assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
	    assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
	  }

}
