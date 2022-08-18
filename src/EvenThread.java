public class EvenThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("EvenThread " +i);
                Thread.sleep(15);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
