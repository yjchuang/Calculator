import static org.junit.Assert.*;

import org.junit.Test;

public class divisionTest {
	
	Operation S = new Operation() ;

	@Test
	   public void test_division1() {
	      System.out.println("Test if division works...") ;
	      
	      assertTrue(S.division(23,0) == Double.POSITIVE_INFINITY) ;
	   }
	
	@Test
	   public void test_division2() {
	      System.out.println("Test if division works...") ;
	      
	      assertTrue(S.division(-12, 12) == -1) ;
	   }
	
	@Test
	   public void test_division3() {
	      System.out.println("Test if division works...") ;
	      
	      assertTrue(S.division(-22, 2) == -11) ;
	   }


}
