package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 10:19
 */
public class TellThread {
    private static class MyThread extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
                System.out.println(1111);
                boolean interrupted = Thread.interrupted();
                if(interrupted) break;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt(); //赐白绫给t；
        System.out.println("t被赐死");
    }
}
