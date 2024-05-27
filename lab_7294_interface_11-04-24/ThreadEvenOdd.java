//3) Create two threads to print odd numbers and even numbers from 1 to 100?

package lab.inheritance;
//start of the program
public class ThreadEvenOdd {
	    // Runnable class to print even numbers
        static class PrintEven implements Runnable {
          @Override
          public void run() {
             for (int i = 2; i <= 100; i += 2) {
                System.out.println("Even: "+i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }
          }
        }
	    // Runnable class to print odd numbers
	    static class PrintOdd implements Runnable {
	        @Override
	        public void run() {
	            for (int i = 1; i <= 100; i += 2) {
	                System.out.println("Odd: "+i);
	                try {
	                    Thread.sleep(100); // Sleep for 100 milliseconds
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
   
	    public static void main(String[] args) {
	        // Create two threads for printing odd and even numbers
	        Thread oddThread = new Thread(new PrintOdd());
	        Thread evenThread = new Thread(new PrintEven());

	        // Start the threads
	        oddThread.start();
	        evenThread.start();
	    }

		public static void sleep(int i) {
			// TODO Auto-generated method stub
			
		}
}
//end of the program