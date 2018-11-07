public class z1 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        new Thread(new SleepThread()).start();
        for(int i = 1;i<10; i++){
            if(i == 5){
                Thread.sleep(2000);
            }
            System.out.println("Producer put"+i);
            Thread.sleep(500);
        }
    }

}
class SleepThread implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 1;i<10;i++){
            if(i==3){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Consumer get"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}