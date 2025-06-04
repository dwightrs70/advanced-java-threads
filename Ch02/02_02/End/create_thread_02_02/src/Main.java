public class Main {
    public static void main(String[] args) {
        // Create three instanaces of the thread
        FirstThread thread1 = new FirstThread();
        FirstThread thread2 = new FirstThread();
        FirstThread thread3 = new FirstThread();

        // Start the three threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
