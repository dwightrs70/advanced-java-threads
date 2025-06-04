// Create a thread class that implements Runnable
// Java allows implementing multiple interfaces,
// which could be helpful to work around single
// parent inheritance
public class MyRunnable implements Runnable {
    // Override the run() method to do the work
    // of the thread
    @Override
    public void run() {
        for(int i=1; i<= 5; i++) {
            System.out.println(i);
        }
    }
}

