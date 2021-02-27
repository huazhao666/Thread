package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 11:38
 */
public class TwoThread {
    private static  int x = 0;
    //count越大，正确率越低，因为发生调度次数增多；
    private static final int COUNT = 1000;
    private static class Adder extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < COUNT; i++) {
                x--;
            }
        }
    }
    private static class Suder extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < COUNT; i++) {
                x++;
            }
        }
    }
  public static void main(String[] args) throws InterruptedException {
        Thread adder = new Adder();
        Thread suber  = new Suder();
        adder.start();
        suber.start();
        adder.join();
        suber.join();
        System.out.println(x);
    }
}
