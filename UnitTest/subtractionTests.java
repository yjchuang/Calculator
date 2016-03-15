import static org.junit.Assert.*;

import org.junit.Test;

public class subtractionTests {
	
	Operation S = new Operation() ;

	@Test
	   public void test_subtraction1() {
	      System.out.println("Test if subtraction works...") ;
	      
	      assertTrue(S.subtraction(23,34) == -11) ;
	   }
	
	@Test
	   public void test_subtraction2() {
	      System.out.println("Test if subtraction works...") ;
	      
	      assertTrue(S.subtraction(-12, 12) == -24) ;
	   }
	
	@Test
	   public void test_subtraction3() {
	      System.out.println("Test if subtraction works...") ;
	      
	      assertTrue(S.subtraction(-23, 45) == -68) ;
	   }


}
