import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTests {

	
	
	@Test
	   public void test_addition1() {
	      System.out.println("Test if addition works...") ;
	      Operation S = new Operation() ;
	      assertTrue(S.addition(23,34) == 57) ;
	   }
	
	@Test
	   public void test_addition2() {
	      System.out.println("Test if addition works...") ;
	      Operation S = new Operation() ;
	      assertTrue(S.addition(-12, 12) == 0) ;
	   }
	
	@Test
	   public void test_addition3() {
	      System.out.println("Test if addition works...") ;
	      Operation S = new Operation() ;
	      assertTrue(S.addition(-23, 45) == 22) ;
	   }


}
