package codeExercise.primeNumberChecker

import org.slf4j.LoggerFactory
import scala.collection.mutable.Set


/**
 * This class include the implementation of PrimeNumberChecker.
 * PrimeNumberChecker have some utility method related on prime number.
 * @author shihao zhong
 *
 */
class PrimeNumberChecker {
  
  val logger = LoggerFactory.getLogger("logger");
  /**
	 * This method will find the prime number in a substring 
	 * 
	 * @param primeString  String only contains digit.
	 * @return Set[Int]  All of the prime number in any substring of the given string
	 */
  def findPrimeNumberInSubString(primeString: String): Set[Int] = {
    val res = Set[Int]();
    val isVisited = Set[Int]();
    
    // Check if we have a valid input graph.
		if (!isValidInput(primeString)) {
		  logger.warn("invalid input");
			return res;
		}
		
		for (i <- 0 to primeString.length()) {
		  for (j <- i + 1 to primeString.length()) {
		    val num = primeString.substring(i, j).toInt;
		    if (!isVisited.contains(num)) {
		      isVisited.add(num);
		      if (isPrimeNumber(num)) {
		        res.add(num);
		      }
		    }
		  }
		}
		
    return res;
  }
  
  /**
	 * Check if this number is prime
	 * @param number Int  number need to be check
	 * #return Boolean  if number is a prime number return true, else false
	 */
  def isPrimeNumber(number: Int): Boolean = {
    if (number == 1) {
      return false;
    }
    val end = math.sqrt(number).toInt;
    for (i <- 2 to end) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
  
  
  /**
	 * This method will check if we have a valid input string.
	 * @param primeString String  input value need to be check
	 * @return Boolean if input string have correct format return true, else false.
	 */
  def isValidInput(primeString: String): Boolean = {
    val validCharRegex = "^[0-9]*$";
    if (primeString == null) { // Check null input.
			return false;
    } else if (!(primeString matches validCharRegex)) { // check if input only cotains digit
			return false;
    }
    
		return true;
  }
}