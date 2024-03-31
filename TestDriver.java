/**
 *
 * Driver to test fibonacci
 * 
 * @author tai
 *
 */
public class TestDriver extends Fibonacci {
  public static void main(String[] args) {

    int numExperiments = 10000; // set number of experiments to 1000


    for (int numElements = 1; numElements < 30; numElements++) {
      long startTime = System.currentTimeMillis(); // start time

      for (int ex = 0; ex < numExperiments; ex++) {

        int result = fib(numElements); // compute result
      }

      long endTime = System.currentTimeMillis(); // end time
      System.out
          .println(" " + numElements + " " + ((endTime - startTime) / (double) numExperiments));
    }
  } // end of main
} // end of test driver class

