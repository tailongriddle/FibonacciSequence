/***
 * 
 * Class that computes fibonacci sequence 
 * 
 * @author tai
 *
 */
public class Fibonacci {
  /***
   * Calculates the fibonacci sequence
   * Makes first two of the fib sequence be 1 
   * 
   * @param n
   * @return
   */
  public static int fib(int n) { 
    if (n == 1) { // if n is 1
      return 1; // return 1
    } else if (n == 2) { // if n is 2 
      return 1; // return 1 
    } else {

      return fib(n - 1) + fib(n - 2); // return the most recent number plus the number before it
    }
    
    
    
  }
}
