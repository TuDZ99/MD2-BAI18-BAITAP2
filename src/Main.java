public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);
        thread.start();
        thread1.start();
        thread.join();
    }
}
