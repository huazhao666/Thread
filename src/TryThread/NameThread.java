package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-23
 * Time : 11:04
 */
public class NameThread {
    private static class MyThread extends Thread{
        public MyThread(String name) {
            super(name);
        }
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread("小黑");
        Thread t2 = new MyThread("小白");
        Thread t3 = new MyThread("小蓝");
        t1.start();
        t2.start();
        t3.start();
    }
}
