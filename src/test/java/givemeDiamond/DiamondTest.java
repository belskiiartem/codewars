package givemeDiamond;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTest {

    @Test
    public void testDiamond3() {
      StringBuffer expected = new StringBuffer();
      expected.append(" *\n");
      expected.append("***\n");
      expected.append(" *\n");
      
      assertEquals(expected.toString(), Diamond.print(3));
    }
    
    @Test
    public void testDiamond5() {
      StringBuffer expected = new StringBuffer();
      expected.append("  *\n");
      expected.append(" ***\n");
      expected.append("*****\n");
      expected.append(" ***\n");
      expected.append("  *\n");
      
      assertEquals(expected.toString(), Diamond.print(5));
    }    
}
