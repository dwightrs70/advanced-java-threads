// Create a thread class that inherits from Thread
// Java is limited to single parent inheritence
public class FirstThread extends Thread {
    // Override the run() method to implement the 
    // thread fuctionality
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
