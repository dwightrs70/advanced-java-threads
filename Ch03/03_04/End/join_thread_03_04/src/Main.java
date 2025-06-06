public class Main {

    public static void main(String[] args) {
        int[] marks = new int[10];
        Thread marksThread = new Thread(new Marks(marks));
        Thread avgThread = new Thread(new Average(marks));
        marksThread.start();

        try {
            marksThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        avgThread.start();
    }
}
