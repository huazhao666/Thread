package TryThread;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-21
 * Time : 11:50
 */
public class MyThread4 {
    static class  MyThread extends Thread{
        @Override
        public void run() {
            method("子");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread = new Thread(thread1);
        thread.start();
        method("父");
    }
    private static void method(String name){
        while (true){
            System.out.println(name);
        }
    }
}
