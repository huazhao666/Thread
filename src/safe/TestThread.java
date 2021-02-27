package safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2021-01-04
 * Time : 8:45
 */
public class TestThread {
    private static String signal; // 信号灯
    private static Lock lock = new ReentrantLock();

    static class MyRunnableA implements Runnable{
        int n = 10;
        @Override
        public void run() {
            while (n > 0 ){
                lock.lock();
                while (!signal.equals("a")){
                    lock.unlock();
                    //主动放弃锁
                    Thread.yield();
                    lock.lock();
                }
                System.out.print("a");
                signal="b";
                //释放锁；
                lock.unlock();
                n--;
            }
        }
    }
    static class MyRunnableB implements Runnable{
        int n = 10;
        @Override
        public void run() {
            while (n > 0){
                lock.lock();
                while (!signal.equals("b")){
                    lock.unlock();
                    //主动放弃锁
                    Thread.yield();
                    lock.lock();
                }
                System.out.print("b");
                signal="c";
                //释放锁；
                lock.unlock();
                n--;
            }
        }
    }
    static class MyRunnableC implements Runnable{
        int n = 10;
        @Override
        public void run() {
            while (n > 0){
                lock.lock();
                while (!signal.equals("c")){
                    lock.unlock();
                    //主动放弃锁
                    Thread.yield();
                    lock.lock();
                }
                System.out.print("c");
                signal="a";
                //释放锁；
                lock.unlock();
                n--;
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
       Runnable runnable = new MyRunnableA();
       Thread a = new Thread(runnable);
        Runnable runnable1 = new MyRunnableB();
        Thread b = new Thread(runnable1);
        Runnable runnable2 = new MyRunnableC();
        Thread c = new Thread(runnable2);
        signal = "a";
        a.start();
        b.start();
        c.start();


    }

}
