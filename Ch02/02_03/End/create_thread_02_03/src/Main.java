public class Main {
    public static void main(String[] args) {
        // This thread inherits from Thread
        FirstThread thread1 = new FirstThread();

        // This thread implements Runnable
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);

        // Start the threads
        thread1.start();
        thread2.start();

        // Off-hand, this doesn't seem to interweave
        // the threads. They may be created with
        // different priorities.
    }
}
