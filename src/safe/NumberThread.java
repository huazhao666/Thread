package safe;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-04
 * Time : 23:06
 */
public class NumberThread {
     private static class MyRunnable implements Runnable{
        private final int num;
         public MyRunnable(int num) {
             this.num = num;
         }

         @Override
         public void run() {
             System.out.println(num);
         }
     }

    public static void main1(String[] args) {
        Runnable runnable1 = new MyRunnable(1);
        Thread t1 = new Thread(runnable1);
        Runnable runnable2 = new MyRunnable(2);
        Thread t2 = new Thread(runnable2);
        Runnable runnable3 = new MyRunnable(3);
        Thread t3 = new Thread(runnable3);

    }
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        Thread.sleep(2000);
        System.out.println("2");
    }
}
