package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 11:38
 */
public class TwoThread {
    private static  int x = 0;
    //count越大，正确率越低，因为发生调度次数增多；但是加了锁就好啦，保证了原子性
    private static final int COUNT = 10000;
    static  final Object lock = new Object();
    private static class Adder extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                for (int i = 0; i < COUNT; i++) {
                    x++;
                }
            }
        }
    }
    private static class Suder extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                for (int i = 0; i < COUNT; i++) {
                    x++;
                }
            }
        }
    }
  public static void main(String[] args) throws InterruptedException {
        Thread adder = new Adder();
        Thread thread = new Adder();
        adder.start();
        thread.start();
        adder.join();
        thread.join();
        System.out.println(x);
    }
}
