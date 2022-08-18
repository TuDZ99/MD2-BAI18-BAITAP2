public class OddThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println("OddThread " +i);
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
