import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ModulusTest {

	Operation S = new Operation() ;

	@Test
	   public void test_modulus1() {
	      System.out.println("Test if modulus works...") ;
//Assert.fail();	      
	      assertTrue(S.modulus(23,0) == 0.0d/0.0) ;
	   }
	
	@Test
	   public void test_modulus2() {
	      System.out.println("Test if modulus works...") ;
	      
	      assertTrue(S.modulus(-12, 2) == 0) ;
	   }
	
	@Test
	   public void test_modulus3() {
	      System.out.println("Test if modulus works...") ;
	      
	      assertTrue(S.modulus(-22, 3) == -1) ;
	   }


}


