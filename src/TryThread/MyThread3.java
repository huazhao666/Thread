package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-21
 * Time : 11:43
 */
public class MyThread3 {
    static class MyRunnable implements Runnable{
        @Override
        public void run(){
            int x = 5;
            while (x > 0){
                System.out.println("子线程");
                x--;
            }
        }
    }
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        int i = 5;
        while (i > 0){
            System.out.println("父线程");
            i--;
        }
    }
}
