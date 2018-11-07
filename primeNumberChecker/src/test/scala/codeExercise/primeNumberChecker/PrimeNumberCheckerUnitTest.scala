package codeExercise.primeNumberChecker

import org.junit.Test
import org.junit.Assert._


/**
 * Unit test for primeNumberChekcer
 */
class PrimeNumberCheckerUnitTest {
  
   /**
	 * Constructor for TeamBuilderUnitTest class.
	 * It will create a TeamBuilder entity and start a null check.
	 */
    @Test
    def PrimeNumberCheckerUnitTest(): Unit = {
      val checker = new PrimeNumberChecker();
      assertNotNull(checker);
    }
    
   /**
	 * Unit test for on method PrimeNumberChekcer.PrimeNumberChecker
	 * Check regular data
	 */
    @Test  
	  def testPrimeNumberChecker(): Unit = {
      val checker = new PrimeNumberChecker();
      val res = checker.findPrimeNumberInSubString("123456789");
      val ans = Set(2, 23, 23456789, 3, 4567, 5, 67, 7, 89);
		  assertEquals(res == ans, true);     
	  }
    
   /**
	 * Unit test for on method PrimeNumberChekcer.PrimeNumberChecker
	 * Check no result
	 */
    @Test  
	  def testPrimeNumberCheckerEmpty(): Unit = {
      val checker = new PrimeNumberChecker();
      val res = checker.findPrimeNumberInSubString("18");
      val ans = Set();
		  assertEquals(res == ans, true);     
	  }
    
   /**
	 * Unit test for on method PrimeNumberChekcer.PrimeNumberChecker
	 * Check 
	 */
    @Test  
	  def testPrimeNumberCheckerSingle(): Unit = {
      val checker = new PrimeNumberChecker();
      val res = checker.findPrimeNumberInSubString("2");
      val ans = Set(2);
		  assertEquals(res == ans, true);     
	  }
    
   /**
	 * Unit test for on method PrimeNumberChekcer.PrimeNumberChecker
	 * Check null value
	 */
    @Test  
	  def testNullValue(): Unit = {
      val checker = new PrimeNumberChecker();
      val res = checker.findPrimeNumberInSubString(null);
      val ans = Set();
		  assertEquals(res == ans, true);     
	  }
    
    
}
